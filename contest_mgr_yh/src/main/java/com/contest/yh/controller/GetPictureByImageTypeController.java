package com.contest.yh.controller;

import com.contest.yh.entity.GetPictureByImageType;
import com.contest.yh.service.GetPictureByImageTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/GetHspRequest")
public class GetPictureByImageTypeController {

    @Autowired
    private GetPictureByImageTypeService service;

    // 获取所有文档
    @PostMapping("/GetPictureByImageType")
    public Flux<GetPictureByImageType> getAllDocuments() {
        return service.getAllDocuments();
    }

}
