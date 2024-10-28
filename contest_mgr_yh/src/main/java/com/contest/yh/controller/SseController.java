package com.contest.yh.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.time.LocalTime;

@RestController
public class SseController {

    @GetMapping(value = "/sseGet", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> streamSSE() {
        // 每秒钟推送一次时间给客户端，模拟持续推送事件
        return Flux.interval(Duration.ofSeconds(1))
                .map(sequence -> "SSE Event - " + LocalTime.now());
    }
}
