package com.contest.yh.service;

import com.contest.yh.entity.GetPhoneInstitution;
import com.contest.yh.repository.GetPhoneInstitutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class GetPhoneInstitutionService {

    @Autowired
    private GetPhoneInstitutionRepository repository;

    // 查询所有文档
    public Flux<GetPhoneInstitution> getAllDocuments() {
        return repository.findAll();
    }

    // 根据 WarningCode 查询单个文档
    /*public Mono<GetPhoneInstitution> getDocumentByWarningCode(int warningCode) {
        return repository.findByWarningCode(warningCode);
    }*/
}
