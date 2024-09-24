package com.contest.yh.controller;

import com.contest.yh.entity.GetDoctorListByIsConsult;
import com.contest.yh.entity.GetDoctorListByLocationId;
import com.contest.yh.service.GetDoctorListByIsConsultService;
import com.contest.yh.service.GetDoctorListByLocationIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GetDoctorListByIsConsultController {

    @Autowired
    private GetDoctorListByIsConsultService getDoctorListByIsConsultService;

    @PostMapping("/GetDoctorListByIsConsult")
    public Mono<GetDoctorListByIsConsult> GetDoctorListByIsConsult() {
        // 返回 GetJsonStr 集合的所有数据
        return Mono.from(getDoctorListByIsConsultService.findAll());
    }
}
