package com.contest.yh.controller;

import com.contest.yh.entity.GetVipCareByPatIds;
import com.contest.yh.service.GetVipCareByPatIdsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GetVipCareByPatIdsController {

    @Autowired
    private GetVipCareByPatIdsService service;

    @PostMapping("/GetVipCareByPatIds")
    public Mono<GetVipCareByPatIds> GetVipCareByPatIds() {
        // 返回 GetByKeyNumSetValue 集合的所有数据
        return Mono.from(service.findAll());
    }
}
