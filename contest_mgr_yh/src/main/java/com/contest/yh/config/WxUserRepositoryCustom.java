package com.contest.yh.config;

import com.contest.yh.entity.WxUser;

import org.springframework.r2dbc.core.DatabaseClient;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public class WxUserRepositoryCustom {

    private final DatabaseClient databaseClient;

    public WxUserRepositoryCustom(DatabaseClient databaseClient) {
        this.databaseClient = databaseClient;
    }

    public Flux<WxUser> findAll() {
        return databaseClient
                .sql("SELECT * FROM wx_user")
                .map(row -> {
                    // 手动处理类型转换
                    Boolean subscribed = row.get("subscribed", Boolean.class);
                    // 其他字段映射...
                    WxUser user = new WxUser();
                    user.setSubscribed(subscribed);
                    return user;
                })
                .all();
    }
}
