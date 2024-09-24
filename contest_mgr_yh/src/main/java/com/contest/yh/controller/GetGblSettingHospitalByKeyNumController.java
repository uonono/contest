package com.contest.yh.controller;

import com.contest.yh.entity.GetGblSettingHospitalByKeyNum;
import com.contest.yh.service.GetGblSettingHospitalByKeyNumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class GetGblSettingHospitalByKeyNumController {

    @Autowired
    private GetGblSettingHospitalByKeyNumService service;

    @PostMapping("/GetGblSettingHospitalByKeyNum")
    public Mono<GetGblSettingHospitalByKeyNum> getAllSettings() {
        // 返回 GetGblSettingHospitalByKeyNum 集合的所有数据
        return Mono.from(service.findAll());
    }
}
