package com.contest.yh.controller;

import com.contest.yh.entity.GetJsonStr;
import com.contest.yh.service.GetJsonStrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GetJsonStrController {

    @Autowired
    private GetJsonStrService getJsonStrService;

    @PostMapping("/GetJsonStr")
    public Mono<GetJsonStr> getAllJsonStr() {
        // 返回 GetJsonStr 集合的所有数据
        return Mono.from(getJsonStrService.findAll());
    }
}
