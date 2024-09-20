package com.contest.yh.service;

import com.contest.yh.entity.GetBsLocationAllActive;
import com.contest.yh.repository.GetBsLocationAllActiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class GetBsLocationAllActiveService {

    @Autowired
    private GetBsLocationAllActiveRepository repository;

    // 查询所有文档
    public Flux<GetBsLocationAllActive> getAllDocuments() {
        return repository.findAll();
    }
}
