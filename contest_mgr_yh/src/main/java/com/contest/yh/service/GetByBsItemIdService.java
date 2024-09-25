package com.contest.yh.service;

import com.contest.yh.entity.GetByBsItemId;
import com.contest.yh.entity.GetByBsItemIds;
import com.contest.yh.repository.GetByBsItemIdRepository;
import com.contest.yh.repository.GetByBsItemIdsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GetByBsItemIdService {

    @Autowired
    private GetByBsItemIdRepository getByBsItemIdRepository;

    public Mono<GetByBsItemId> findAll() {
        return Mono.from(getByBsItemIdRepository.findAll());
    }
}
