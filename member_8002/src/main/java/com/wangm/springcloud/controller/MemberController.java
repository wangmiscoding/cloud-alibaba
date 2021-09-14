package com.wangm.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangm
 * @since 2021/8/20
 */
@RestController
@RequestMapping("member")
public class MemberController {


    @GetMapping("get")
    public String getUser(Integer userId) {
        return "一个用户信息";
    }

    @GetMapping("feign")
    public String feign(@RequestParam String user) {
        return user + "feign调用8002";
    }

}


