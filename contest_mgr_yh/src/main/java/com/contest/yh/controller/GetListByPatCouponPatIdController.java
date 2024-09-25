package com.contest.yh.controller;

import com.contest.yh.entity.GetListByPatCouponPatId;
import com.contest.yh.service.GetListByPatCouponPatIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GetListByPatCouponPatIdController {

    @Autowired
    private GetListByPatCouponPatIdService service;

    @PostMapping("/GetListByPatCouponPatId")
    public Mono<GetListByPatCouponPatId> getAllSettings() {
        // 返回 GetByKeyNumSetValue 集合的所有数据
        return Mono.from(service.findAll());
    }
}
