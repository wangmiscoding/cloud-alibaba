package com.wangm.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
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
        return user + "feign调用8001";
    }

    @PostMapping
    public String addUser(Integer userId) {
        return "添加成功";
    }

}


