package com.contest.yh.controller;

import com.contest.yh.entity.GetBsDoctorByMobile;
import com.contest.yh.entity.GetBsShippingAddressListByPatId;
import com.contest.yh.service.GetBsDoctorByMobileService;
import com.contest.yh.service.GetBsShippingAddressListByPatIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GetBsDoctorByMobileController {

    @Autowired
    private GetBsDoctorByMobileService service;

    @PostMapping("/GetBsDoctorByMobile")
    public Mono<GetBsDoctorByMobile> GetBsDoctorByMobile() {
        // 返回 GetByKeyNumSetValue 集合的所有数据
        return Mono.from(service.findAll());
    }
}
