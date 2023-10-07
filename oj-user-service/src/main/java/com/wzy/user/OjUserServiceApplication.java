package com.wzy.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 王灼宇
 * @Since 2023/10/5 16:09
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OjUserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OjUserServiceApplication.class, args);
    }
}
