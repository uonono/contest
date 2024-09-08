package com.contest.yh.service;

import com.contest.yh.entity.WxUser;
import com.contest.yh.repository.WxUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class WxUserService {

    @Autowired
    private WxUserRepository wxUserRepository;

    // 查询所有微信用户
    public Flux<WxUser> findAllUsers() {
        return wxUserRepository.findAll();
    }

    // 根据城市查询微信用户
    public Flux<WxUser> findUsersByCity(String city) {
        return wxUserRepository.findByCity(city);
    }

    // 根据微信用户ID查询
    public Mono<WxUser> findUserById(String wxUserId) {
        return wxUserRepository.findByWxUserId(wxUserId);
    }
}
