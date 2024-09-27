package com.contest.yh.repository;

import com.contest.yh.entity.GetDoctorListByIsConsult;
import com.contest.yh.entity.GetOaTrainInfo;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface GetOaTrainInfoRepository extends ReactiveMongoRepository<GetOaTrainInfo, String> {
    // 可以在这里自定义查询方法，如有需要
}
