package com.contest.yh.service;

import com.contest.yh.entity.GetBsDoctorByMobile;
import com.contest.yh.entity.GetBsShippingAddressListByPatId;
import com.contest.yh.repository.GetBsDoctorByMobileRepository;
import com.contest.yh.repository.GetBsShippingAddressListByPatIdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GetBsDoctorByMobileService {

    @Autowired
    private GetBsDoctorByMobileRepository getBsDoctorByMobileRepository;

    public Mono<GetBsDoctorByMobile> findAll() {
        return Mono.from(getBsDoctorByMobileRepository.findAll());
    }
}
