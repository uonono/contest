package com.contest.yh.repository;

import com.contest.yh.entity.GetSecondBased;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface getSecondBasedRepository extends ReactiveMongoRepository<GetSecondBased, String> {

}
