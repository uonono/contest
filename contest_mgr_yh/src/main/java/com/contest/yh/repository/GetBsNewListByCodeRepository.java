package com.contest.yh.repository;

import com.contest.yh.entity.GetBsDoctorByMobile;
import com.contest.yh.entity.GetBsNewListByCode;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface GetBsNewListByCodeRepository extends ReactiveMongoRepository<GetBsNewListByCode, String> {

}
