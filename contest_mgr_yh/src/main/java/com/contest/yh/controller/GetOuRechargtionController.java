package com.contest.yh.controller;

import com.contest.yh.entity.GetDoctorListByIsConsult;
import com.contest.yh.entity.GetOuRechargtion;
import com.contest.yh.service.GetDoctorListByIsConsultService;
import com.contest.yh.service.GetOuRechargtionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GetOuRechargtionController {

    @Autowired
    private GetOuRechargtionService getOuRechargtionService;

    @PostMapping("/GetOuRechargtion")
    public Mono<GetOuRechargtion> GetDoctorListByIsConsult() {
        // 返回 GetJsonStr 集合的所有数据
        return Mono.from(getOuRechargtionService.findAll());
    }
}
