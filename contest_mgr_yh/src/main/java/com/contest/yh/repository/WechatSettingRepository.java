package com.contest.yh.repository;

import com.contest.yh.entity.GblSettingWechat;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface WechatSettingRepository extends ReactiveCrudRepository<GblSettingWechat, String> {

    @Query("SELECT * FROM gbl_setting_wechat WHERE his_type = :hisType AND hospital_id = :hospitalId")
    Flux<GblSettingWechat> findByHisTypeAndHospitalId(String hisType, String hospitalId);
}
