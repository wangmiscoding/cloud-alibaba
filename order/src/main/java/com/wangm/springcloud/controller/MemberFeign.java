package com.wangm.springcloud.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangm
 * @since 2021/9/4
 */
@FeignClient(value = "member-service", path = "member")
public interface MemberFeign {

    @GetMapping("feign")
    String feign(@RequestParam String user);
}
