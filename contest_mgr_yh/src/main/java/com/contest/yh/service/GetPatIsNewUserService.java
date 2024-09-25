package com.contest.yh.service;

import com.contest.yh.entity.GetBsDoctorByMobile;
import com.contest.yh.entity.GetPatIsNewUser;
import com.contest.yh.repository.GetBsDoctorByMobileRepository;
import com.contest.yh.repository.GetPatIsNewUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GetPatIsNewUserService {

    @Autowired
    private GetPatIsNewUserRepository getPatIsNewUserRepository;

    public Mono<GetPatIsNewUser> findAll() {
        return Mono.from(getPatIsNewUserRepository.findAll());
    }
}
