package com.wangm.springcloud.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * TODO
 *
 * @author wangm
 * @since 2021/8/20
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    RestTemplate restTemplate;
    @Resource
    MemberFeign feign;
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("to-member")
    public String orderToMember() {
        return restTemplate.getForObject("http://member-service/member/get", String.class);
    }


    @GetMapping("feign")
    public String feign() {
        return feign.feign("wangm");
    }


}
