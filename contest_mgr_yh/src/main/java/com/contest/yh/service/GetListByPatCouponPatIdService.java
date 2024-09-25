package com.contest.yh.service;

import com.contest.yh.entity.GetListByPatCouponPatId;
import com.contest.yh.entity.GetOuRechargtion;
import com.contest.yh.repository.GetListByPatCouponPatIdRepository;
import com.contest.yh.repository.GetOuRechargtionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GetListByPatCouponPatIdService {

    @Autowired
    private GetListByPatCouponPatIdRepository getListByPatCouponPatIdRepository;

    public Mono<GetListByPatCouponPatId> findAll() {
        return Mono.from(getListByPatCouponPatIdRepository.findAll());
    }
}
