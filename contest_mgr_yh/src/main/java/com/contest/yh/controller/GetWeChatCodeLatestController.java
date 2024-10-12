package com.contest.yh.controller;

import com.contest.yh.entity.GetWeChatCodeLatest;
import com.contest.yh.service.GetWeChatCodeLatestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GetWeChatCodeLatestController {

    @Autowired
    private GetWeChatCodeLatestService getWeChatCodeLatestService;

    @PostMapping("/GetWeChatCodeLatest")
    public Mono<GetWeChatCodeLatest> GetWeChatCodeLatest() {
        // 返回 GetWeChatCodeLatest 集合的所有数据
        return Mono.from(getWeChatCodeLatestService.findAll());
    }
}
