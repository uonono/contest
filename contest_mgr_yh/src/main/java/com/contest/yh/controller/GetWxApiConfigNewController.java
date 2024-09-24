package com.contest.yh.controller;

import com.contest.yh.entity.GetDoctorListByLocationId;
import com.contest.yh.entity.GetWxApiConfigNew;
import com.contest.yh.service.GetDoctorListByLocationIdService;
import com.contest.yh.service.GetWxApiConfigNewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GetWxApiConfigNewController {

    @Autowired
    private GetWxApiConfigNewService getWxApiConfigNewService;

    @PostMapping("/GetWxApiConfigNew")
    public Mono<GetWxApiConfigNew> GetWxApiConfigNew() {
        // 返回 GetJsonStr 集合的所有数据
        return Mono.from(getWxApiConfigNewService.findAll());
    }
}
