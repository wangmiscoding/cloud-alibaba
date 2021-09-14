package com.wangm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wangm
 * @since 2021/9/5
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Member8002Main {
    public static void main(String[] args) {
        SpringApplication.run(Member8002Main.class, args);
    }
}
