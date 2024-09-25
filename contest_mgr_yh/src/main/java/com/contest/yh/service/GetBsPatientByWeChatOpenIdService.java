package com.contest.yh.service;

import com.contest.yh.entity.GetBsDoctorByMobile;
import com.contest.yh.entity.GetBsPatientByWeChatOpenId;
import com.contest.yh.repository.GetBsDoctorByMobileRepository;
import com.contest.yh.repository.GetBsPatientByWeChatOpenIdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GetBsPatientByWeChatOpenIdService {

    @Autowired
    private GetBsPatientByWeChatOpenIdRepository getBsPatientByWeChatOpenIdRepository;

    public Mono<GetBsPatientByWeChatOpenId> findAll() {
        return Mono.from(getBsPatientByWeChatOpenIdRepository.findAll());
    }
}
