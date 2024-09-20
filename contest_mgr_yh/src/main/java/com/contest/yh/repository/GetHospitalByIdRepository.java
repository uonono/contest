package com.contest.yh.repository;

import com.contest.yh.entity.GetHospitalById;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface GetHospitalByIdRepository extends ReactiveMongoRepository<GetHospitalById, String> {
    // 这里可以自定义一些查询方法，如果需要的话
    @Query("{ 'WarningCode': ?0, '_id': ?1 }")
    Mono<GetHospitalById> findByWarningCodeAndId(int warningCode, String id);
}
