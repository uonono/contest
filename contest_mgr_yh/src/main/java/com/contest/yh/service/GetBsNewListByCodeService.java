package com.contest.yh.service;

import com.contest.yh.entity.GetBsDoctorByMobile;
import com.contest.yh.entity.GetBsNewListByCode;
import com.contest.yh.repository.GetBsDoctorByMobileRepository;
import com.contest.yh.repository.GetBsNewListByCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GetBsNewListByCodeService {

    @Autowired
    private GetBsNewListByCodeRepository getBsNewListByCodeRepository;

    public Mono<GetBsNewListByCode> findAll() {
        return Mono.from(getBsNewListByCodeRepository.findAll());
    }
}
