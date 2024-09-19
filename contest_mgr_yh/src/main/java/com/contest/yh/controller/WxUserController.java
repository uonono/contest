package com.contest.yh.controller;

import com.contest.yh.entity.WxUser;
import com.contest.yh.exception.AjaxResponse;
import com.contest.yh.service.GblSettingWechatService;
import com.contest.yh.service.WxUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class WxUserController {

    @Autowired
    private WxUserService wxUserService;

    @Autowired
    private GblSettingWechatService wechatSettingService;

    @PostMapping("/GetGblSettingWechat")
    public Mono<AjaxResponse> getGblSettingWechat() {
        return wechatSettingService.findAll() // 获取 Flux 流
                .collectList() // 将 Flux 转换为 List
                .map(AjaxResponse::success); // 使用 R.success(data) 包装响应数据
    }

    /**
     * 获取所有微信用户
     * @return 响应式的用户列表
     */
    @GetMapping("/all")
    public Flux<WxUser> getAllUsers() {
        return wxUserService.findAllUsers();
    }

    /**
     * 根据城市查询微信用户
     * @param city 城市名称
     * @return 响应式的用户列表
     */
    @GetMapping("/city/{city}")
    public Flux<WxUser> getUsersByCity(@PathVariable String city) {
        return wxUserService.findUsersByCity(city);
    }

    /**
     * 根据微信用户ID查询
     * @param id 微信用户ID
     * @return 响应式的用户信息
     */
    /*@GetMapping("/{id}")
    public Mono<WxUser> getUserById(@PathVariable String id) {
        return wxUserService.findUserById(id);
    }*/
}
