package com.contest.yh.repository;

import com.contest.yh.entity.GetBusiness_WXD;
import com.contest.yh.entity.GetVipCareByPatIds;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface GetVipCareByPatIdsRepository extends ReactiveMongoRepository<GetVipCareByPatIds, String> {

}
