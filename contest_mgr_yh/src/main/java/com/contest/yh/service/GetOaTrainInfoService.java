package com.contest.yh.service;

import com.contest.yh.entity.GetBsPatgeaThypeByHealthtypeid;
import com.contest.yh.entity.GetOaTrainInfo;
import com.contest.yh.repository.GetBsPatgeaThypeByHealthtypeidRepository;
import com.contest.yh.repository.GetOaTrainInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GetOaTrainInfoService {

    @Autowired
    private GetOaTrainInfoRepository getOaTrainInfoRepository;

    public Mono<GetOaTrainInfo> findAll() {
        return Mono.from(getOaTrainInfoRepository.findAll());
    }
}
