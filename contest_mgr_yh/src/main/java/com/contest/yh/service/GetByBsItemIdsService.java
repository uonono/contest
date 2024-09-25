package com.contest.yh.service;

import com.contest.yh.entity.GetByBsItemIds;
import com.contest.yh.repository.GetByBsItemIdsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GetByBsItemIdsService {

    @Autowired
    private GetByBsItemIdsRepository getByBsItemIdsRepository;

    public Mono<GetByBsItemIds> findAll() {
        return Mono.from(getByBsItemIdsRepository.findAll());
    }
}
