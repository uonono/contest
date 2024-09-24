package com.contest.yh.service;

import com.contest.yh.entity.GetListPatByIntroducerPatID;
import com.contest.yh.repository.GetListPatByIntroducerPatIDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class GetListPatByIntroducerPatIDService {

    @Autowired
    private GetListPatByIntroducerPatIDRepository getListPatByIntroducerPatIDRepository;

    public Flux<GetListPatByIntroducerPatID> findAll() {
        return getListPatByIntroducerPatIDRepository.findAll();
    }
}
