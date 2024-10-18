package com.contest.yh.controller;

import com.contest.yh.exception.AjaxResponse;
import com.contest.yh.exception.CustomException;
import com.contest.yh.exception.CustomExceptionType;
import com.contest.yh.model.AuthorizedLoginResponse;
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

    @PostMapping("/AuthorizedLoginLatest")
    public Mono<AjaxResponse> handleLogin(@RequestBody Map<String, String> requestBody) {
        // 获取 code 参数
        String code = requestBody.get("code");

        // 调用 fetchToken 方法并返回 AuthorizedLoginResponse
        // 如果成功，返回封装好的 AjaxResponse
        return authorizedLoginLatestService.fetchToken(code)
                .map(AjaxResponse::success)
                .onErrorResume(e -> {
                    // 捕获异常，并返回错误响应
                    CustomException customException = new CustomException(CustomExceptionType.SYSTEM_ERROR, e.getMessage());
                    return Mono.just(AjaxResponse.error(customException));
                });
    }

}
