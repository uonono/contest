package com.contest.yh.service;

import com.contest.yh.entity.GetHospitalById;
import com.contest.yh.repository.GetHospitalByIdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class GetHospitalByIdService {

    @Autowired
    private GetHospitalByIdRepository repository;

    public Flux<GetHospitalById> findAll() {
        return repository.findAll();
    }
}
