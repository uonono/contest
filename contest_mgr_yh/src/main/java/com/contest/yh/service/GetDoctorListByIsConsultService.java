package com.contest.yh.service;

import com.contest.yh.entity.GetDoctorListByIsConsult;
import com.contest.yh.entity.GetDoctorListByLocationId;
import com.contest.yh.repository.GetDoctorListByIsConsultRepository;
import com.contest.yh.repository.GetDoctorListByLocationIdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class GetDoctorListByIsConsultService {

    @Autowired
    private GetDoctorListByIsConsultRepository getDoctorListByIsConsultRepository;

    public Mono<GetDoctorListByIsConsult> findAll() {
        return Mono.from(getDoctorListByIsConsultRepository.findAll());
    }
}
