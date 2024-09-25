package com.contest.yh.service;

import com.contest.yh.entity.GetSecondBased;
import com.contest.yh.repository.getSecondBasedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class getSecondBasedService {

    @Autowired
    private getSecondBasedRepository getByBsItemIdsRepository;

    public Mono<GetSecondBased> findAll() {
        return Mono.from(getByBsItemIdsRepository.findAll());
    }
}
