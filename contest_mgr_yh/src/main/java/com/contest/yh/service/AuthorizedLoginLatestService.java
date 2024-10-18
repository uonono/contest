package com.contest.yh.service;

import com.contest.yh.model.AccessTokenResponse;
import com.contest.yh.model.AuthorizedLoginResponse;
import com.contest.yh.model.UserInfoResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

@Service
public class AuthorizedLoginLatestService {

    @Value("${xcx.account.appId}")
    private String appid;

    @Value("${xcx.account.appSecret}")
    private String secret;

    private final WebClient webClient;

    /**
     *  创建带基础URL的WebClient实例
     */
    private final WebClient wechatClient;

    private final ObjectMapper objectMapper;

    @Autowired
    public AuthorizedLoginLatestService(WebClient webClient, WebClient wechatClient, ObjectMapper objectMapper) {
        // 注入的 WebClient 和 ObjectMapper
        this.webClient = webClient;
        this.wechatClient =  webClient.mutate().baseUrl("https://api.weixin.qq.com").build();;
        this.objectMapper = objectMapper;
    }

    /**
     * 获取 access token 的方法
     * @param code 授权码
     * @return 微信获取用户关联的AccessToken
     */
    public Mono<AccessTokenResponse> getAccessToken(String code) {
        return wechatClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/sns/oauth2/access_token")
                        .queryParam("appid", appid)
                        .queryParam("secret", secret)
                        .queryParam("code", code)
                        .queryParam("grant_type", "authorization_code")
                        .build())
                .retrieve()
                .bodyToMono(String.class)  // 获取响应体为String类型
                .flatMap(this::parseAccessTokenResponse)  // 解析成AccessTokenResponse
                .doOnNext(response -> {
                    System.out.println("Access token response: " + response);
                })
                .onErrorResume(WebClientResponseException.class, e -> {
                    // 处理异常响应
                    System.err.println("Error while fetching access token: " + e.getMessage());
                    return Mono.error(e);
                });
    }

    /**
     * 解析字符串为AccessTokenResponse对象
     * @param responseBody 微信响应
     * @return 响应后的实体
     */
    private Mono<AccessTokenResponse> parseAccessTokenResponse(String responseBody) {
        try {
            // 将响应体解析为AccessTokenResponse
            AccessTokenResponse response = objectMapper.readValue(responseBody, AccessTokenResponse.class);
            return Mono.just(response);
        } catch (IOException e) {
            // 处理JSON解析错误
            System.err.println("Failed to parse access token response: " + e.getMessage());
            return Mono.error(e);
        }
    }

    /**
     * 发送请求到 127.0.0.1:9000/token 并获取 token，将其存储到 AuthorizedLoginResponse 中
     * @param code 授权码
     * @return 带用户信息和token的传输类
     */
    public Mono<AuthorizedLoginResponse> fetchToken(String code) {
        // 先获取 access token 和 openid
        return getAccessToken(code)
                .flatMap(accessTokenResponse -> {
                    String openid = accessTokenResponse.getOpenid();
                    String accessToken = accessTokenResponse.getAccessToken(); // 获取 access token

                    // 使用 WebClient 请求微信的 userinfo 接口
                    return wechatClient.get()
                            .uri(uriBuilder -> uriBuilder
                                    .path("/sns/userinfo")
                                    .queryParam("access_token", accessToken) // 传入 access_token
                                    .queryParam("openid", openid)            // 传入 openid
                                    .queryParam("lang", "zh_CN")             // 设置语言
                                    .build())
                            .retrieve()
                            .bodyToMono(String.class) // 先获取响应体为字符串
                            .flatMap(this::parseUserInfoResponse) // 手动解析为 UserInfoResponse
                            .flatMap(userInfoResponse -> {
                                // 构建 Basic Auth 头，用户名和密码都为 openid
                                String authHeader = "Basic " + Base64.getEncoder()
                                        .encodeToString((openid + ":" + openid).getBytes(StandardCharsets.UTF_8));

                                // 发送请求到 127.0.0.1:9000/token
                                return webClient.post()
                                        .uri("https://127.0.0.1:9000/token")
                                        .header("Authorization", authHeader)
                                        .retrieve()
                                        .bodyToMono(String.class)
                                        .flatMap(token -> {
                                            // 构建返回的 AuthorizedLoginResponse 对象
                                            AuthorizedLoginResponse authorizedLoginResponse = new AuthorizedLoginResponse();
                                            authorizedLoginResponse.setOpenid(accessTokenResponse.getOpenid());
                                            authorizedLoginResponse.setScope(accessTokenResponse.getScope());
                                            authorizedLoginResponse.setIsSnapshotuser(accessTokenResponse.getIsSnapshotuser());
                                            authorizedLoginResponse.setUnionid(accessTokenResponse.getUnionid());
                                            authorizedLoginResponse.setToken(token); // 将获取到的 token 存储到 response 中

                                            // 将微信用户信息添加到 AuthorizedLoginResponse 对象中
                                            authorizedLoginResponse.setNickname(userInfoResponse.getNickname());
                                            authorizedLoginResponse.setSex(userInfoResponse.getSex());
                                            authorizedLoginResponse.setProvince(userInfoResponse.getProvince());
                                            authorizedLoginResponse.setCity(userInfoResponse.getCity());
                                            authorizedLoginResponse.setCountry(userInfoResponse.getCountry());
                                            authorizedLoginResponse.setHeadimgurl(userInfoResponse.getHeadimgurl());
                                            authorizedLoginResponse.setPrivilege(userInfoResponse.getPrivilege());

                                            System.out.println("Fetched token: " + token);
                                            System.out.println("User info response: " + userInfoResponse);

                                            return Mono.just(authorizedLoginResponse);
                                        });
                            });
                });
    }

    /**
     * 解析字符串为UserInfoResponse对象
     * @param responseBody 微信响应
     * @return 响应后的UserInfoResponse实体
     */
    private Mono<UserInfoResponse> parseUserInfoResponse(String responseBody) {
        try {
            // 将响应体解析为 UserInfoResponse
            UserInfoResponse response = objectMapper.readValue(responseBody, UserInfoResponse.class);
            return Mono.just(response);
        } catch (IOException e) {
            // 处理JSON解析错误
            System.err.println("Failed to parse user info response: " + e.getMessage());
            return Mono.error(e);
        }
    }


}
