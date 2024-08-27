package com.contest.gateway.controllor;

import com.contest.gateway.WebClientConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
/**
* @Author: cy
* @Date: 2024/8/22 下午2:30
* @Description: 粗略实现自定义webFlux网关，绕过springCloud的https证书检测（java的）
*/
@RestController
@RequestMapping("/api")
public class GatewayController {

    /*private final WebClient webClient;

    @Autowired
    public GatewayController(WebClient webClient) {
        this.webClient = webClient;
    }*/

    /*@GetMapping("/fetchLocalUserInfo")
    public Mono<ResponseEntity<String>> fetchLocalUserInfo() {
        return this.webClient.get()
                .uri("https://127.0.0.1:8768/userInfo")  // 替换为你的本地服务的URL
                .retrieve()
                .toEntity(String.class)
                .doOnSuccess(response -> {
                    System.out.println("Response received from local service:");
                    System.out.println(response.getBody());  // 打印响应体
                })
                .doOnError(error -> {
                    System.err.println("Error occurred while fetching from local service:");
                    System.err.println(error.getMessage());
                });
    }


    @GetMapping("/fetchGoogle")
    public Mono<ResponseEntity<String>> fetchGoogle() {
        return this.webClient.get()
                .uri("https://www.google.com")  // 目标URL
                .retrieve()
                .toEntity(String.class)
                .doOnSuccess(response -> {
                    System.out.println("Response received from Google:");
                    System.out.println(response.getBody());  // 打印响应体
                })
                .doOnError(error -> {
                    System.err.println("Error occurred while fetching Google:");
                    System.err.println(error.getMessage());
                });
    }*/
}


