package com.contest.yh.controller;

import com.contest.yh.entity.GetHospitalById;
import com.contest.yh.service.GetHospitalByIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class GetHospitalByIdController {

    @Autowired
    private GetHospitalByIdService service;

    @PostMapping("/GetHospitalById")
    public Mono<GetHospitalById> getAllHospitals() {
        // 返回 GetHospitalById 集合的所有数据
        return Mono.from(service.findAll());
    }
}
