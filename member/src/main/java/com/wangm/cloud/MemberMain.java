package com.wangm.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * TODO
 *
 * @author wangm
 * @since 2021/8/20
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MemberMain {

    public static void main(String[] args) {
        SpringApplication.run(MemberMain.class, args);
    }
}
