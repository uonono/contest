package com.contest.yh.repository;

import com.contest.yh.entity.GetWcPatCouponListByPatId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface GetWcPatCouponListByPatIdRepository extends ReactiveMongoRepository<GetWcPatCouponListByPatId, String> {
    // 可以在这里自定义查询方法，如有需要
}
