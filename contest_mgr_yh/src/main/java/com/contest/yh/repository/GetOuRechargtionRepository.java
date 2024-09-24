package com.contest.yh.repository;

import com.contest.yh.entity.GetOuRechargtion;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface GetOuRechargtionRepository extends ReactiveMongoRepository<GetOuRechargtion, String> {
    // 可以在这里自定义查询方法，如有需要
}
