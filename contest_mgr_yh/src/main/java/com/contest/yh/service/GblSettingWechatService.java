package com.contest.yh.service;

import com.contest.yh.entity.GblSettingWechat;
import com.contest.yh.entity.GblSettingWechatForMongoDB;
import com.contest.yh.repository.GblSettingWechatRepository;
import com.contest.yh.repository.WechatSettingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class GblSettingWechatService {

    @Autowired
    private WechatSettingRepository wechatSettingRepository;

    // 根据 hisType 和 hospitalId 查询数据
    public Mono<GblSettingWechat> findByHisTypeAndHospitalId(String hisType, String hospitalId) {
        return wechatSettingRepository.findByHisTypeAndHospitalId(hisType, hospitalId);
    }

    public Mono<Void> saveBatch(List<GblSettingWechat> gblSettingWechats) {
        return wechatSettingRepository.saveAll(gblSettingWechats)
                .then();  // 保存后返回一个空的 Mono<Void>
    }

    @Autowired
    private GblSettingWechatRepository gblSettingWechatRepository;

    public Flux<GblSettingWechatForMongoDB> saveAll(List<GblSettingWechatForMongoDB> gblSettingWechats) {
        return gblSettingWechatRepository.saveAll(gblSettingWechats);
    }
}
