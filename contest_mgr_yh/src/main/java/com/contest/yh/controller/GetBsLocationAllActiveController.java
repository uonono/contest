package com.contest.yh.controller;

import com.contest.yh.entity.GetBsLocationAllActive;
import com.contest.yh.service.GetBsLocationAllActiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class GetBsLocationAllActiveController {

    @Autowired
    private GetBsLocationAllActiveService service;

    // 获取所有文档
    @PostMapping("/GetBsLocationAllActive")
    public Mono<GetBsLocationAllActive> getAllDocuments() {
        return Mono.from(service.getAllDocuments());
    }
}
