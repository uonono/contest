package com.contest.yh.repository;

import com.contest.yh.entity.GetHospitalById;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface GetHospitalByIdRepository extends ReactiveMongoRepository<GetHospitalById, String> {
    // 这里可以自定义一些查询方法，如果需要的话
}
