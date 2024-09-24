package com.contest.yh.controller;

import com.contest.yh.entity.GetWcReservePatByPatId;
import com.contest.yh.service.GetWcReservePatByPatIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GetWcReservePatByPatIdController {

    @Autowired
    private GetWcReservePatByPatIdService getWcReservePatByPatIdService;

    @PostMapping("/GetWcReservePatByPatId")
    public Mono<GetWcReservePatByPatId> GetWcReservePatByPatId() {
        // 返回 GetJsonStr 集合的所有数据
        return Mono.from(getWcReservePatByPatIdService.findAll());
    }
}
