package com.contest.yh.service;

import com.contest.yh.entity.GetWcReservePatByPatId;
import com.contest.yh.repository.GetWcReservePatByPatIdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GetWcReservePatByPatIdService {

    @Autowired
    private GetWcReservePatByPatIdRepository getWcReservePatByPatIdRepository;

    public Mono<GetWcReservePatByPatId> findAll() {
        return Mono.from(getWcReservePatByPatIdRepository.findAll());
    }
}
