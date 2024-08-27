package com.contest.gateway;

import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.SSLContext;
import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.SecureRandom;

public class SSLContextConfig {

    /*public static SSLContext createCustomSSLContext() throws Exception {
        // 加载自定义信任库
        KeyStore keyStore = KeyStore.getInstance("JKS");
        try (FileInputStream keyStoreStream = new FileInputStream("path/to/your/custom-truststore.jks")) {
            keyStore.load(keyStoreStream, "truststore-password".toCharArray());
        }

        // 初始化TrustManagerFactory
        TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        tmf.init(keyStore);

        // 创建并初始化SSLContext
        SSLContext sslContext = SSLContext.getInstance("TLS");
        sslContext.init(null, tmf.getTrustManagers(), new SecureRandom());

        return sslContext;
    }*/
}
