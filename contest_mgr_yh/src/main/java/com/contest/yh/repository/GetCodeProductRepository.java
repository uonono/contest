package com.contest.yh.repository;

import com.contest.yh.entity.GetByBsItemIds;
import com.contest.yh.entity.GetCodeProduct;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface GetCodeProductRepository extends ReactiveMongoRepository<GetCodeProduct, String> {

}
