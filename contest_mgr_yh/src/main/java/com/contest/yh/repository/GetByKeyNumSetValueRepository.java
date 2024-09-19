package com.contest.yh.repository;

import com.contest.yh.entity.GetByKeyNumSetValue;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface GetByKeyNumSetValueRepository extends ReactiveMongoRepository<GetByKeyNumSetValue, String> {
    // 可以根据需要自定义查询方法
}
