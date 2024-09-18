package com.contest.yh.service;

import com.contest.yh.entity.GblSettingWechat;
import com.contest.yh.repository.WechatSettingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GblSettingWechatService {

    @Autowired
    private WechatSettingRepository wechatSettingRepository;

    // 根据 hisType 和 hospitalId 查询数据
    public Mono<GblSettingWechat> findByHisTypeAndHospitalId(String hisType, String hospitalId) {
        return wechatSettingRepository.findByHisTypeAndHospitalId(hisType, hospitalId);
    }
}
