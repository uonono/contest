package com.contest.yh.repository;

import com.contest.yh.entity.GetPictureByImageType;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface GetPictureByImageTypeRepository extends ReactiveMongoRepository<GetPictureByImageType, String> {
    // 根据 ImageType 查询所有符合条件的文档
    Flux<GetPictureByImageType> findAll();
}
