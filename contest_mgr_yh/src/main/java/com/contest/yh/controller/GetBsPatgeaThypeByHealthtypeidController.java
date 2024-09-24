package com.contest.yh.controller;

import com.contest.yh.entity.GetBsPatgeaThypeByHealthtypeid;
import com.contest.yh.service.GetBsPatgeaThypeByHealthtypeidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GetBsPatgeaThypeByHealthtypeidController {

    @Autowired
    private GetBsPatgeaThypeByHealthtypeidService getBsPatgeaThypeByHealthtypeidService;

    @PostMapping("/GetBsPatgeaThypeByHealthtypeid")
    public Mono<GetBsPatgeaThypeByHealthtypeid> GetBsPatgeaThypeByHealthtypeid() {
        // 返回 GetJsonStr 集合的所有数据
        return Mono.from(getBsPatgeaThypeByHealthtypeidService.findAll());
    }
}
