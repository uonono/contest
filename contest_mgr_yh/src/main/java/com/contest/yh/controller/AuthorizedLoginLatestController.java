package com.contest.yh.controller;

import com.contest.yh.exception.AjaxResponse;
import com.contest.yh.exception.CustomException;
import com.contest.yh.exception.CustomExceptionType;
import com.contest.yh.service.AuthorizedLoginLatestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Map;

@RestController
public class AuthorizedLoginLatestController {

    @Autowired
    private AuthorizedLoginLatestService authorizedLoginLatestService;

    /**
     * 开放的登录接口
     * @param requestBody 接收的code授权码
     * @return 用户的个人信息
     */
    @PostMapping("/AuthorizedLoginLatest")
    public Mono<AjaxResponse> handleLogin(@RequestBody(required = false) Map<String, String> requestBody) {

        if (requestBody == null || !requestBody.containsKey("code")) {
            return Mono.just(AjaxResponse.error(new CustomException(CustomExceptionType.REQUEST_PARAMETER_ERROR, "Request body is empty or missing code")));
        }
        // 获取 code 参数
        String code = requestBody.get("code");

        // 验证 code
        if (code == null || code.matches("^[a-zA-Z]+$") || code.matches("^[0-9]+$")) {
            return Mono.just(AjaxResponse.error(new CustomException(CustomExceptionType.REQUEST_PARAMETER_ERROR, "Invalid code format")));
        }

        // 调用 fetchToken 方法并返回 AuthorizedLoginResponse
        return authorizedLoginLatestService.fetchToken(code)
                .map(AjaxResponse::success)
                .onErrorResume(e -> {
                    // 捕获异常，并返回错误响应
                    CustomException customException = new CustomException(CustomExceptionType.SYSTEM_ERROR, e.getMessage());
                    return Mono.just(AjaxResponse.error(customException));
                });
    }




}
