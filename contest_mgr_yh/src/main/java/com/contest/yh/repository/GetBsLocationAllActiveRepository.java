package com.contest.yh.repository;

import com.contest.yh.entity.GetBsLocationAllActive;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;


public interface GetBsLocationAllActiveRepository extends ReactiveMongoRepository<GetBsLocationAllActive, String> {
    // 只需要继承 ReactiveMongoRepository，无需额外定义方法
}
