package com.contest.yh.service;

import com.contest.yh.entity.GetHospitalById;
import com.contest.yh.repository.GetHospitalByIdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class GetHospitalByIdService {

    @Autowired
    private GetHospitalByIdRepository repository;


    public Mono<GetHospitalById> findAll() {
        return repository.findByWarningCodeAndId(2000,"66ec00137b550000be004e35");
    }

}
