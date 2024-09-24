package com.contest.yh.controller;

import com.contest.yh.entity.GetDoctorListByLocationId;
import com.contest.yh.entity.GetJsonStr;
import com.contest.yh.service.GetDoctorListByLocationIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GetDoctorListByLocationIdController {

    @Autowired
    private GetDoctorListByLocationIdService getDoctorListByLocationIdService;

    @PostMapping("/GetDoctorListByLocationId")
    public Mono<GetDoctorListByLocationId> GetDoctorListByLocationId() {
        // 返回 GetJsonStr 集合的所有数据
        return Mono.from(getDoctorListByLocationIdService.findAll());
    }
}
