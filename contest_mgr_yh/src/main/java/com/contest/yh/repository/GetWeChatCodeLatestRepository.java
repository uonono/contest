package com.contest.yh.repository;

import com.contest.yh.entity.GetWeChatCodeLatest;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface GetWeChatCodeLatestRepository extends ReactiveMongoRepository<GetWeChatCodeLatest, String> {
    // 可以在这里自定义查询方法，如有需要
}
