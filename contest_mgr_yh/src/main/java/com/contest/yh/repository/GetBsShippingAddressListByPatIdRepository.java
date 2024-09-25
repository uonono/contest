package com.contest.yh.repository;

import com.contest.yh.entity.GetBsShippingAddressListByPatId;
import com.contest.yh.entity.GetBusiness_WXD;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface GetBsShippingAddressListByPatIdRepository extends ReactiveMongoRepository<GetBsShippingAddressListByPatId, String> {

}
