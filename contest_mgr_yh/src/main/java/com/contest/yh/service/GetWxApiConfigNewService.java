package com.contest.yh.service;

import com.contest.yh.entity.GetWxApiConfigNew;
import com.contest.yh.repository.GetWxApiConfigNewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GetWxApiConfigNewService {

    @Autowired
    private GetWxApiConfigNewRepository getWxApiConfigNewRepository;

    public Mono<GetWxApiConfigNew> findAll() {
        return Mono.from(getWxApiConfigNewRepository.findAll());
    }
}
