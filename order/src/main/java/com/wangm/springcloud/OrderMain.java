package com.wangm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * TODO
 *
 * @author wangm
 * @since 2021/8/20
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderMain {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain.class, args);
    }


    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
