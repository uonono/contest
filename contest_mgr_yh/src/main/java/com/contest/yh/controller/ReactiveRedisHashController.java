package com.contest.yh.controller;

import com.contest.yh.service.ReactiveRedisHashService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.AbstractMap;
import java.util.Map;

@RestController
@RequestMapping("/api/redis/reactive")
public class ReactiveRedisHashController {

    @Autowired
    private ReactiveRedisHashService reactiveRedisHashService;

    @Autowired
    private ReactiveRedisTemplate<String, String> reactiveRedisTemplate;


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

    @GetMapping("/all")
    public Flux<Map.Entry<String, Object>> getAllKeysAndValues() {
        // 通过 Redis 的 keys * 命令获取所有键
        return reactiveRedisTemplate.keys("*")
                .flatMap(key ->
                        reactiveRedisTemplate.type(key)  // 获取键的类型
                                .flatMap(type -> {
                                    switch (type.code()) {
                                        case "string": // 如果是字符串类型
                                            return reactiveRedisTemplate.opsForValue().get(key)
                                                    .map(value -> new AbstractMap.SimpleEntry<>(key, value));
                                        case "hash":  // 如果是 Hash 类型
                                            return reactiveRedisTemplate.opsForHash().entries(key)
                                                    .collectMap(Map.Entry::getKey, Map.Entry::getValue)
                                                    .map(value -> new AbstractMap.SimpleEntry<>(key, value));
                                        case "list":  // 如果是 List 类型
                                            return reactiveRedisTemplate.opsForList().range(key, 0, -1)
                                                    .collectList()
                                                    .map(value -> new AbstractMap.SimpleEntry<>(key, value));
                                        case "set":   // 如果是 Set 类型
                                            return reactiveRedisTemplate.opsForSet().members(key)
                                                    .collectList()
                                                    .map(value -> new AbstractMap.SimpleEntry<>(key, value));
                                        default:
                                            return Mono.empty(); // 不支持的类型，返回空
                                    }
                                })
                );
    }


}
