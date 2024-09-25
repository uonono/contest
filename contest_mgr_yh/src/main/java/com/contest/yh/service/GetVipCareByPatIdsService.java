package com.contest.yh.service;

import com.contest.yh.entity.GetVipCareByPatIds;
import com.contest.yh.repository.GetVipCareByPatIdsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GetVipCareByPatIdsService {

    @Autowired
    private GetVipCareByPatIdsRepository getVipCareByPatIdsRepository;

    public Mono<GetVipCareByPatIds> findAll() {
        return Mono.from(getVipCareByPatIdsRepository.findAll());
    }
}
