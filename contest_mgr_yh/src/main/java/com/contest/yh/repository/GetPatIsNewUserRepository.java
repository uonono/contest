package com.contest.yh.repository;

import com.contest.yh.entity.GetBsDoctorByMobile;
import com.contest.yh.entity.GetPatIsNewUser;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface GetPatIsNewUserRepository extends ReactiveMongoRepository<GetPatIsNewUser, String> {

}
