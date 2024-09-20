package com.contest.yh.controller;

import com.contest.yh.entity.GetPhoneInstitution;
import com.contest.yh.service.GetPhoneInstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/GetHspRequest")
public class GetPhoneInstitutionController {

    @Autowired
    private GetPhoneInstitutionService service;

    // 获取所有文档
    @PostMapping("/GetPhoneInstitution")
    public Mono<GetPhoneInstitution> getAllDocuments() {
        return Mono.from(service.getAllDocuments());
    }

    // 根据 WarningCode 获取单个文档
    /*@GetMapping("/warningCode/{code}")
    public Mono<GetPhoneInstitution> getDocumentByWarningCode(@PathVariable("code") int warningCode) {
        return service.getDocumentByWarningCode(warningCode);
    }*/
}
