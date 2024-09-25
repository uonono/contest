package com.contest.yh.repository;

import com.contest.yh.entity.GetBsDoctorByMobile;
import com.contest.yh.entity.GetByBsItemIds;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface GetBsDoctorByMobileRepository extends ReactiveMongoRepository<GetBsDoctorByMobile, String> {

}
