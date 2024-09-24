package com.contest.yh.controller;

import com.contest.yh.entity.GetWcPatCouponListByPatId;
import com.contest.yh.service.GetWcPatCouponListByPatIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GetWcPatCouponListByPatIdController {

    @Autowired
    private GetWcPatCouponListByPatIdService getWcPatCouponListByPatIdService;

    @PostMapping("/GetWcPatCouponListByPatId")
    public Mono<GetWcPatCouponListByPatId> GetWcPatCouponListByPatId() {
        // 返回 GetJsonStr 集合的所有数据
        return Mono.from(getWcPatCouponListByPatIdService.findAll());
    }
}
