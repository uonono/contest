package com.contest.yh.repository;

import com.contest.yh.entity.GetByBsItemIds;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface GetByBsItemIdsRepository extends ReactiveMongoRepository<GetByBsItemIds, String> {

}
