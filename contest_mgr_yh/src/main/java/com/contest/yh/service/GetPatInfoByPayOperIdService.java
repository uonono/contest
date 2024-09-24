package com.contest.yh.service;

import com.contest.yh.entity.GetDoctorListByLocationId;
import com.contest.yh.entity.GetPatInfoByPayOperId;
import com.contest.yh.repository.GetDoctorListByLocationIdRepository;
import com.contest.yh.repository.GetPatInfoByPayOperIdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class GetPatInfoByPayOperIdService {

    @Autowired
    private GetPatInfoByPayOperIdRepository getPatInfoByPayOperIdRepository;

    public Flux<GetPatInfoByPayOperId> findAll() {
        return getPatInfoByPayOperIdRepository.findAll();
    }
}
