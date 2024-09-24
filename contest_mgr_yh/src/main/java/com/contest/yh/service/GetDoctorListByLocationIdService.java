package com.contest.yh.service;

import com.contest.yh.entity.GetDoctorListByLocationId;
import com.contest.yh.repository.GetDoctorListByLocationIdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class GetDoctorListByLocationIdService {

    @Autowired
    private GetDoctorListByLocationIdRepository getDoctorListByLocationIdRepository;

    public Flux<GetDoctorListByLocationId> findAll() {
        return getDoctorListByLocationIdRepository.findAll();
    }
}
