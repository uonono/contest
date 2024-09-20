package com.contest.yh.service;

import com.alibaba.fastjson.JSONObject;
import com.contest.yh.entity.GblSettingWechat;
import com.contest.yh.entity.GblSettingWechatForMongoDB;
import com.contest.yh.repository.GblSettingWechatRepository;
import com.contest.yh.repository.WechatSettingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class GblSettingWechatService {

    @Autowired
    private WechatSettingRepository wechatSettingRepository;

    @Autowired
    private ReactiveMongoTemplate mongoTemplate;

    public Flux<GblSettingWechatForMongoDB> findByDynamicQuery(int hisType, int hospitalId) {
        Query query = new Query();

        // 添加动态查询条件
        query.addCriteria(Criteria.where("hisType").is(hisType));
        query.addCriteria(Criteria.where("hospitalId").is(hospitalId));

        /*if (isActive) {
            query.addCriteria(Criteria.where("IsActive").is(true));
        }*/
        // 使用 ReactiveMongoTemplate 进行查询
        return mongoTemplate.find(query, GblSettingWechatForMongoDB.class);
    }


    public Mono<Void> saveBatch(List<GblSettingWechat> gblSettingWechats) {
        return wechatSettingRepository.saveAll(gblSettingWechats)
                .then();  // 保存后返回一个空的 Mono<Void>
    }

    @Autowired
    private GblSettingWechatRepository gblSettingWechatRepository;

//    public Flux<GblSettingWechatForMongoDB> saveAll(List<GblSettingWechatForMongoDB> gblSettingWechats) {
//        return gblSettingWechatRepository.saveAll(gblSettingWechats);
//    }

    public Flux<GblSettingWechatForMongoDB> findAll() {
        return gblSettingWechatRepository.findAll();
    }
}
