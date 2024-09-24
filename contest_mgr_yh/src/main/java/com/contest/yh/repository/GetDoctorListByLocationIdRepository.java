package com.contest.yh.repository;

import com.contest.yh.entity.GetDoctorListByLocationId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface GetDoctorListByLocationIdRepository extends ReactiveMongoRepository<GetDoctorListByLocationId, String> {
    // 可以在这里自定义查询方法，如有需要
}
