package com.wzy.question;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 王灼宇
 * @Since 2023/10/7 9:51
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OjQuestionServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OjQuestionServiceApplication.class, args);
    }
}
