package com.contest.yh.service;

import com.contest.yh.entity.GetGblSettingHospitalByKeyNum;
import com.contest.yh.repository.GetGblSettingHospitalByKeyNumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class GetGblSettingHospitalByKeyNumService {

    @Autowired
    private GetGblSettingHospitalByKeyNumRepository repository;

    public Flux<GetGblSettingHospitalByKeyNum> findAll() {
        return repository.findAll();
    }
}
