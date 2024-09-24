package com.contest.yh.service;

import com.contest.yh.entity.GetDoctorListByIsConsult;
import com.contest.yh.entity.GetWcPatCouponListByPatId;
import com.contest.yh.repository.GetDoctorListByIsConsultRepository;
import com.contest.yh.repository.GetWcPatCouponListByPatIdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class GetWcPatCouponListByPatIdService {

    @Autowired
    private GetWcPatCouponListByPatIdRepository getWcPatCouponListByPatIdRepository;

    public Flux<GetWcPatCouponListByPatId> findAll() {
        return getWcPatCouponListByPatIdRepository.findAll();
    }
}
