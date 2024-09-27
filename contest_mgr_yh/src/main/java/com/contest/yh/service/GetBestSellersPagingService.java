package com.contest.yh.service;

import com.contest.yh.entity.GetBestSellersPaging;
import com.contest.yh.entity.GetOaTrainInfo;
import com.contest.yh.repository.GetBestSellersPagingRepository;
import com.contest.yh.repository.GetOaTrainInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GetBestSellersPagingService {

    @Autowired
    private GetBestSellersPagingRepository getBestSellersPagingRepository;

    public Mono<GetBestSellersPaging> findAll() {
        return Mono.from(getBestSellersPagingRepository.findAll());
    }
}
