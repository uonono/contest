package com.contest.yh.service;

import com.contest.yh.entity.GetBsPatgeaThypeByHealthtypeid;
import com.contest.yh.repository.GetBsPatgeaThypeByHealthtypeidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GetBsPatgeaThypeByHealthtypeidService {

    @Autowired
    private GetBsPatgeaThypeByHealthtypeidRepository getBsPatgeaThypeByHealthtypeidRepository;

    public Mono<GetBsPatgeaThypeByHealthtypeid> findAll() {
        return Mono.from(getBsPatgeaThypeByHealthtypeidRepository.findAll());
    }
}
