package com.contest.yh.repository;

import com.contest.yh.entity.GetBestSellers;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface GetBestSellersRepository extends ReactiveMongoRepository<GetBestSellers, String> {
    // 可以在这里自定义查询方法，如有需要
}
