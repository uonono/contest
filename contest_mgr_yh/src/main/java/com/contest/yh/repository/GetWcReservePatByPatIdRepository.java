package com.contest.yh.repository;

import com.contest.yh.entity.GetWcReservePatByPatId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface GetWcReservePatByPatIdRepository extends ReactiveMongoRepository<GetWcReservePatByPatId, String> {
    // 可以在这里自定义查询方法，如有需要
}
