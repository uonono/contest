package com.contest.yh.controller;

import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.netty.http.client.HttpClient;
import reactor.netty.transport.ProxyProvider;

@RestController
@RequestMapping("/proxy")
public class ProxyController {

    @GetMapping("/fetch")
    public Mono<String> fetchRemoteData() {
        // 配置 HttpClient 使用 SOCKS5 代理
        HttpClient httpClient = HttpClient.create()
            .proxy(proxy -> proxy
                .type(ProxyProvider.Proxy.SOCKS5)
                .host("171.115.221.199")
                .port(57225)
            );

        // 创建 WebClient 实例，仅在当前请求中使用
        WebClient webClient = WebClient.builder()
                .clientConnector(new ReactorClientHttpConnector(httpClient))
                .build();

        // 通过 WebClient 发起请求
        return webClient.get()
                .uri("http://192.168.0.106:80")  // 请求远程服务
                .retrieve()
                .bodyToMono(String.class)  // 将响应体转为 Mono<String>
                .onErrorResume(e -> Mono.just("Error occurred: " + e.getMessage()));
    }
}
