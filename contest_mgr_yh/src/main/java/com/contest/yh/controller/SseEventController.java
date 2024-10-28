package com.contest.yh.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

@RestController
public class SseEventController {

    // 创建一个 Sink 来处理主动推送的事件
    private final Sinks.Many<String> sink = Sinks.many().multicast().onBackpressureBuffer();

    @GetMapping(value = "/sse", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> streamEvents() {
        // 返回一个 Flux，当事件发布时推送给客户端
        return sink.asFlux();
    }

    // 模拟某个事件触发，推送消息给客户端
    public void triggerEvent(String message) {
        sink.tryEmitNext(message); // 推送消息到客户端
    }
}
