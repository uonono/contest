package com.contest.yh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
@EnableR2dbcRepositories  // 启用 R2DBC Repositories
@SpringBootApplication
public class ContestMgrYhApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ContestMgrYhApplication.class, args);
    }

}
