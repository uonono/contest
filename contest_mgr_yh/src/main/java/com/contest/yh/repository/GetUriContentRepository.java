package com.contest.yh.repository;

import com.contest.yh.entity.GetUriContent;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface GetUriContentRepository extends ReactiveMongoRepository<GetUriContent, String> {

}
