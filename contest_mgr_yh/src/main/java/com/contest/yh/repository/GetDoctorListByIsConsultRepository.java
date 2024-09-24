package com.contest.yh.repository;

import com.contest.yh.entity.GetDoctorListByIsConsult;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface GetDoctorListByIsConsultRepository extends ReactiveMongoRepository<GetDoctorListByIsConsult, String> {
    // 可以在这里自定义查询方法，如有需要
}
