package com.contest.yh.service;

import com.contest.yh.entity.GetBestSellers;
import com.contest.yh.repository.GetBestSellersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GetBestSellersService {

    @Autowired
    private GetBestSellersRepository getBestSellersRepository;

    public Mono<GetBestSellers> findAll() {
        return Mono.from(getBestSellersRepository.findAll());
    }
}
