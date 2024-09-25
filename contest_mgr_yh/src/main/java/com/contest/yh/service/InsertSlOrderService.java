package com.contest.yh.service;

import com.contest.yh.entity.GetBsDoctorByMobile;
import com.contest.yh.entity.InsertSlOrder;
import com.contest.yh.repository.GetBsDoctorByMobileRepository;
import com.contest.yh.repository.InsertSlOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class InsertSlOrderService {

    @Autowired
    private InsertSlOrderRepository insertSlOrderRepository;

    public Mono<InsertSlOrder> findAll() {
        return Mono.from(insertSlOrderRepository.findAll());
    }
}
