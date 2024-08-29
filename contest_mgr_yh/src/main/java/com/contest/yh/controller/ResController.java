package com.contest.yh.controller;



import com.contest.yh.domain.ApiMethodInfo;
import com.contest.yh.exception.AjaxResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


/**
 * <h1>res</h1>
 * Created by hanqf on 2020/11/6 17:22.
 */

@RestController
@RequestMapping(value = "/res")
public class ResController {

    @ApiMethodInfo(description = "这个是测试")
    @GetMapping("/res1")
    public Mono<AjaxResponse> res1(){
        return Mono.just(AjaxResponse.success("res1"));
    }

    @PostMapping("/res2")
    public Mono<AjaxResponse> res2(){
        return Mono.just(AjaxResponse.success("res2"));
    }

}
