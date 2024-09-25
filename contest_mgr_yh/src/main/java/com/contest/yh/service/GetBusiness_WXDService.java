package com.contest.yh.service;

import com.contest.yh.entity.GetBusiness_WXD;
import com.contest.yh.repository.GetBusiness_WXDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GetBusiness_WXDService {

    @Autowired
    private GetBusiness_WXDRepository getBusinessWxdRepository;

    public Mono<GetBusiness_WXD> findAll() {
        return Mono.from(getBusinessWxdRepository.findAll());
    }
}
