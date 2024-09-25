package com.contest.yh.repository;

import com.contest.yh.entity.GetListByPatCouponPatId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface GetListByPatCouponPatIdRepository extends ReactiveMongoRepository<GetListByPatCouponPatId, String> {

}
