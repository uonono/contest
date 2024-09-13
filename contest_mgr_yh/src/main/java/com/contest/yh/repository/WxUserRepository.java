package com.contest.yh.repository;

import com.contest.yh.entity.WxUser;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface WxUserRepository extends ReactiveCrudRepository<WxUser, String> {

    // 自定义查询，按城市查找用户
    Flux<WxUser> findByCity(String city);

    // 按微信用户ID查询
    Mono<WxUser> findByWxUserId(String wxUserId);
}
