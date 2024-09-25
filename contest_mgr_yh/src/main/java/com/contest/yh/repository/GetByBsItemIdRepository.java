package com.contest.yh.repository;

import com.contest.yh.entity.GetByBsItemId;
import com.contest.yh.entity.GetCodeProduct;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface GetByBsItemIdRepository extends ReactiveMongoRepository<GetByBsItemId, String> {

}
