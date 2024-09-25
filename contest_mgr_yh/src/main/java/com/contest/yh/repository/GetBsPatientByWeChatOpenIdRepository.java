package com.contest.yh.repository;

import com.contest.yh.entity.GetBsNewListByCode;
import com.contest.yh.entity.GetBsPatientByWeChatOpenId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface GetBsPatientByWeChatOpenIdRepository extends ReactiveMongoRepository<GetBsPatientByWeChatOpenId, String> {

}
