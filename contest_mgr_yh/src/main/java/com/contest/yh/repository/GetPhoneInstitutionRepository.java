package com.contest.yh.repository;

import com.contest.yh.entity.GetPhoneInstitution;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface GetPhoneInstitutionRepository extends ReactiveMongoRepository<GetPhoneInstitution, String> {
    // 根据 WarningCode 查询
//    Mono<GetPhoneInstitution> findByWarningCode(int warningCode);
}
