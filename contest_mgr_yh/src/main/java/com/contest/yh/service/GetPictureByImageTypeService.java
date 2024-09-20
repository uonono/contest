package com.contest.yh.service;

import com.contest.yh.entity.GetPictureByImageType;
import com.contest.yh.repository.GetPictureByImageTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class GetPictureByImageTypeService {

    @Autowired
    private GetPictureByImageTypeRepository repository;

    // 查询所有文档
    public Flux<GetPictureByImageType> getAllDocuments() {
        return repository.findAll();
    }

}
