package com.contest.yh.service;

import com.contest.yh.entity.GetBsDoctorByMobile;
import com.contest.yh.entity.GetUriContent;
import com.contest.yh.repository.GetBsDoctorByMobileRepository;
import com.contest.yh.repository.GetUriContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GetUriContentService {

    @Autowired
    private GetUriContentRepository getUriContentRepository;

    public Mono<GetUriContent> findAll() {
        return Mono.from(getUriContentRepository.findAll());
    }
}
