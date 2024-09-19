package com.contest.yh.controller;

import com.contest.yh.entity.GetByKeyNumSetValue;
import com.contest.yh.service.GetByKeyNumSetValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GetByKeyNumSetValueController {

    @Autowired
    private GetByKeyNumSetValueService service;

    @PostMapping("/GetByKeyNumSetValue")
    public Mono<GetByKeyNumSetValue> getAllSettings() {
        // 返回 GetByKeyNumSetValue 集合的所有数据
        return Mono.from(service.findAll());
    }
}
