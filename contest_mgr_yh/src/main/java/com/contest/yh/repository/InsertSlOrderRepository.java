package com.contest.yh.repository;

import com.contest.yh.entity.GetBsDoctorByMobile;
import com.contest.yh.entity.InsertSlOrder;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface InsertSlOrderRepository extends ReactiveMongoRepository<InsertSlOrder, String> {

}
