package com.contest.yh.repository;

import com.contest.yh.entity.GetGblSettingHospitalByKeyNum;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface GetGblSettingHospitalByKeyNumRepository extends ReactiveMongoRepository<GetGblSettingHospitalByKeyNum, String> {
    // 可以根据需要自定义查询方法
}
