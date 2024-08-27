package com.contest.gateway;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContestMgrGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContestMgrGatewayApplication.class, args);
       /* String trustStore = System.getProperty("javax.net.ssl.trustStore");
        if (trustStore == null) {
            String javaHome = System.getProperty("java.home");
            String defaultTrustStorePath = javaHome + "/lib/security/cacerts";
            System.out.println("Default TrustStore path is likely: " + defaultTrustStorePath);
        } else {
            System.out.println("TrustStore path: " + trustStore);
        }*/
    }
    @PostConstruct
    public void init() {
        // 这也可以作为初始化的一部分，在 Spring 完成加载后执行
        /*printTrustStorePath();
        printDefaultTrustStorePath();*/
    }

    private static void printTrustStorePath() {
        String trustStore = System.getProperty("javax.net.ssl.trustStore");
        if (trustStore != null) {
            System.out.println("TrustStore path: " + trustStore);
        } else {
            System.out.println("Using default TrustStore");
        }
    }

    private static void printDefaultTrustStorePath() {
        String trustStore = System.getProperty("javax.net.ssl.trustStore");
        if (trustStore != null) {
            System.out.println("TrustStore path: " + trustStore);
        } else {
            String javaHome = System.getProperty("java.home");
            String defaultTrustStorePath = javaHome + "/lib/security/cacerts";
            System.out.println("Using default TrustStore at: " + defaultTrustStorePath);
        }
    }


}
