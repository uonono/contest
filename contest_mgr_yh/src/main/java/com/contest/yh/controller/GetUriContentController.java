package com.contest.yh.controller;

import com.contest.yh.entity.GetUriContent;
import com.contest.yh.service.GetUriContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GetUriContentController {

    @Autowired
    private GetUriContentService service;

    @PostMapping("/GetUriContent/{dynamicPart}")
    public Mono<GetUriContent> getUriContent(@PathVariable String dynamicPart) {
        return service.findAll(); // 若未找到，返回404
    }
}
