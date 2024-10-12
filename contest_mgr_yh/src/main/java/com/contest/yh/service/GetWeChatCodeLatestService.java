package com.contest.yh.service;

import com.contest.yh.entity.GetWeChatCodeLatest;
import com.contest.yh.repository.GetWeChatCodeLatestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GetWeChatCodeLatestService {

    @Autowired
    private GetWeChatCodeLatestRepository getWeChatCodeLatestRepository;

    public Mono<GetWeChatCodeLatest> findAll() {
        return Mono.from(getWeChatCodeLatestRepository.findAll());
    }
}
