package com.contest.yh.service;

import com.contest.yh.entity.GetDoctorListByIsConsult;
import com.contest.yh.entity.GetOuRechargtion;
import com.contest.yh.repository.GetDoctorListByIsConsultRepository;
import com.contest.yh.repository.GetOuRechargtionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GetOuRechargtionService {

    @Autowired
    private GetOuRechargtionRepository getOuRechargtionRepository;

    public Mono<GetOuRechargtion> findAll() {
        return Mono.from(getOuRechargtionRepository.findAll());
    }
}
