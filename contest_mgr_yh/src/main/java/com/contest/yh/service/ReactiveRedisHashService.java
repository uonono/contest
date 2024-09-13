package com.contest.yh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ReactiveRedisHashService {

    @Autowired
    private ReactiveRedisTemplate<String, Object> reactiveRedisTemplate;

    // 创建一个名为 A 的集合，并设置键 B 和值 C
    public Mono<Boolean> createHash(String collectionName, String key, String value) {
        return reactiveRedisTemplate.opsForHash().put(collectionName, key, value);
    }

    // 获取集合 A 中键为 B 的值
    public Mono<Object> getValueFromHash(String collectionName, String key) {
        return reactiveRedisTemplate.opsForHash().get(collectionName, key);
    }
}
