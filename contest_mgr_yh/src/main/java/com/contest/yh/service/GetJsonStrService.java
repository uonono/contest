package com.contest.yh.service;

import com.contest.yh.entity.GetJsonStr;
import com.contest.yh.repository.GetJsonStrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class GetJsonStrService {

    @Autowired
    private GetJsonStrRepository getJsonStrRepository;

    public Flux<GetJsonStr> findAll() {
        return getJsonStrRepository.findAll();
    }
}
