package com.contest.yh.controller;

import com.contest.yh.entity.GetBsDoctorByMobile;
import com.contest.yh.entity.GetBsPatientByWeChatOpenId;
import com.contest.yh.service.GetBsDoctorByMobileService;
import com.contest.yh.service.GetBsPatientByWeChatOpenIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GetBsPatientByWeChatOpenIdController {

    @Autowired
    private GetBsPatientByWeChatOpenIdService service;

    @PostMapping("/GetBsPatientByWeChatOpenId")
    public Mono<GetBsPatientByWeChatOpenId> GetBsPatientByWeChatOpenId() {
        // 返回 GetByKeyNumSetValue 集合的所有数据
        return Mono.from(service.findAll());
    }
}
