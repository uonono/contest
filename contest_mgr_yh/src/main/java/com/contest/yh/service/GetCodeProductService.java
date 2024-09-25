package com.contest.yh.service;

import com.contest.yh.entity.GetCodeProduct;
import com.contest.yh.repository.GetCodeProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GetCodeProductService {

    @Autowired
    private GetCodeProductRepository getCodeProductRepository;

    public Mono<GetCodeProduct> findAll() {
        return Mono.from(getCodeProductRepository.findAll());
    }
}
