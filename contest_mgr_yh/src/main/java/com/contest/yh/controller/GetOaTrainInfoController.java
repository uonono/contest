package com.contest.yh.controller;

import com.contest.yh.entity.GetListByPatCouponPatId;
import com.contest.yh.entity.GetOaTrainInfo;
import com.contest.yh.service.GetListByPatCouponPatIdService;
import com.contest.yh.service.GetOaTrainInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GetOaTrainInfoController {

    @Autowired
    private GetOaTrainInfoService service;

    @PostMapping("/GetOaTrainInfo")
    public Mono<GetOaTrainInfo> GetOaTrainInfo() {
        // 返回 GetByKeyNumSetValue 集合的所有数据
        return Mono.from(service.findAll());
    }
}
