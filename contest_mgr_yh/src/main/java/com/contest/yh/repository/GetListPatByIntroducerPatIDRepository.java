package com.contest.yh.repository;

import com.contest.yh.entity.GetListPatByIntroducerPatID;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface GetListPatByIntroducerPatIDRepository extends ReactiveMongoRepository<GetListPatByIntroducerPatID, String> {
    // 可以在这里自定义查询方法，如有需要
}
