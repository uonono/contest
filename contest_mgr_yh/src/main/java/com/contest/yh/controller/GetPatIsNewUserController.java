package com.contest.yh.controller;

import com.contest.yh.entity.GetBsNewListByCode;
import com.contest.yh.entity.GetPatIsNewUser;
import com.contest.yh.service.GetBsNewListByCodeService;
import com.contest.yh.service.GetPatIsNewUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GetPatIsNewUserController {

    @Autowired
    private GetPatIsNewUserService service;

    @PostMapping("/GetPatIsNewUser")
    public Mono<GetPatIsNewUser> GetPatIsNewUser() {
        // 返回 GetByKeyNumSetValue 集合的所有数据
        return Mono.from(service.findAll());
    }
}
