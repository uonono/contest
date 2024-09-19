package com.contest.yh.repository;

import com.contest.yh.entity.GblSettingWechat;
import com.contest.yh.entity.GblSettingWechatForMongoDB;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

import java.util.List;

public interface GblSettingWechatRepository extends ReactiveMongoRepository<GblSettingWechatForMongoDB, String> {
    Flux<GblSettingWechat> saveAll(List<GblSettingWechat> gblSettingWechats);

    Flux<GblSettingWechatForMongoDB> findByHisTypeAndHospitalId(String HisType, String HospitalId);
}
