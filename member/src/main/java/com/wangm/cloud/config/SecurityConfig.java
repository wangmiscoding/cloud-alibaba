package com.wangm.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * security配置类
 *
 * @author wangm
 * @since 2021/9/11
 */
@Component
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 原因:升级为Security5.0以上密码支持多种家吗方式，回复以前模式
     *
     * @return
     */
    @Bean
    public static NoOpPasswordEncoder passwordEncoder() {
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }

    /**
     * 新增security账户
     *
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

//        auth.inMemoryAuthentication().withUser("admin").password("admin").authorities("add*` ",);

    }

    /**
     * 配置拦截的规则
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //配置认证方式 token from 表单
        http.authorizeRequests().antMatchers("/**").fullyAuthenticated().and().formLogin();
        http.authorizeRequests()
                .antMatchers(HttpMethod.POST, "/member").hasAnyAuthority("user_add")
                .antMatchers(HttpMethod.DELETE, "/member").hasAnyAuthority("user_del")
                //admin用户所有接口权限
                .antMatchers("/**").fullyAuthenticated().and().formLogin();
    }

}
