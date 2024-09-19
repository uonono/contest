package com.contest.yh.service;

import com.contest.yh.entity.GetByKeyNumSetValue;
import com.contest.yh.repository.GetByKeyNumSetValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class GetByKeyNumSetValueService {

    @Autowired
    private GetByKeyNumSetValueRepository repository;

    public Flux<GetByKeyNumSetValue> findAll() {
        return repository.findAll();
    }
}
