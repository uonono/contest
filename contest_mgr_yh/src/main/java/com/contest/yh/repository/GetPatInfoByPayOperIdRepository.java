package com.contest.yh.repository;

import com.contest.yh.entity.GetPatInfoByPayOperId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface GetPatInfoByPayOperIdRepository extends ReactiveMongoRepository<GetPatInfoByPayOperId, String> {
    // 可以在这里自定义查询方法，如有需要
}
