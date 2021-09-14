package com.wangm.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangm
 * @since 2021/9/5
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLog() {
        return Logger.Level.FULL;
    }
}
