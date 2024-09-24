package com.contest.yh.repository;

import com.contest.yh.entity.GetBsPatgeaThypeByHealthtypeid;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface GetBsPatgeaThypeByHealthtypeidRepository extends ReactiveMongoRepository<GetBsPatgeaThypeByHealthtypeid, String> {
    // 可以在这里自定义查询方法，如有需要
}
