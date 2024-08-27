package com.contest.gateway;

import org.springframework.web.reactive.function.client.WebClient;

public class MyService {

    private final WebClient webClient;

    public MyService(WebClient webClient) {
        this.webClient = webClient;
    }

    public void performRequest() {
        webClient.get()
                .uri("https://example.com")
                .retrieve()
                .bodyToMono(String.class)
                .subscribe(response -> {
                    System.out.println("Response: " + response);
                });
    }
}
