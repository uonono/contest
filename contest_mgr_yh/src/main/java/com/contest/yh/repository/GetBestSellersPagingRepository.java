package com.contest.yh.repository;

import com.contest.yh.entity.GetBestSellersPaging;
import com.contest.yh.entity.GetOaTrainInfo;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface GetBestSellersPagingRepository extends ReactiveMongoRepository<GetBestSellersPaging, String> {
    // 可以在这里自定义查询方法，如有需要
}
