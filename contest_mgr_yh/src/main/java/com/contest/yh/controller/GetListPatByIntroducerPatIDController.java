package com.contest.yh.controller;

import com.contest.yh.entity.GetListPatByIntroducerPatID;
import com.contest.yh.service.GetListPatByIntroducerPatIDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GetListPatByIntroducerPatIDController {

    @Autowired
    private GetListPatByIntroducerPatIDService getListPatByIntroducerPatIDService;

    @PostMapping("/GetListPatByIntroducerPatID")
    public Mono<GetListPatByIntroducerPatID> GetListPatByIntroducerPatID() {
        // 返回 GetJsonStr 集合的所有数据
        return Mono.from(getListPatByIntroducerPatIDService.findAll());
    }
}
