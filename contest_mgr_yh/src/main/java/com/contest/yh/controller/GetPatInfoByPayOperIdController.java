package com.contest.yh.controller;

import com.contest.yh.entity.GetDoctorListByLocationId;
import com.contest.yh.service.GetDoctorListByLocationIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/GetPatInfoByPayOperId")
public class GetPatInfoByPayOperIdController {

    @Autowired
    private GetDoctorListByLocationIdService getDoctorListByLocationIdService;

    @PostMapping("/GeOpenidtCommodity")
    public Mono<GetDoctorListByLocationId> GetDoctorListByLocationId() {
        // 返回 GetJsonStr 集合的所有数据
        return Mono.from(getDoctorListByLocationIdService.findAll());
    }
}
