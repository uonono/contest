package com.contest.yh.controller;

import com.contest.yh.service.ReactiveRedisHashService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/redis/reactive")
public class ReactiveRedisHashController {

    @Autowired
    private ReactiveRedisHashService reactiveRedisHashService;

    // 创建一个名为 A 的集合，设置键 B 和值 C
    @PostMapping("/hash")
    public Mono<String> createHash(@RequestParam String collectionName, @RequestParam String key, @RequestParam String value) {
        return reactiveRedisHashService.createHash(collectionName, key, value)
            .map(result -> "Hash created with key: " + key + " and value: " + value);
    }

    // 获取集合 A 中键为 B 的值
    @GetMapping("/hash")
    public Mono<Object> getHashValue(@RequestParam String collectionName, @RequestParam String key) {
        return reactiveRedisHashService.getValueFromHash(collectionName, key);
    }
}
