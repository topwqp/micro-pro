package com.xs.micro.up.config.bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Description 解决spring-security4.2版本以上非浏览器访问CSRF问题
 * @Author Wang QiuPeng
 * 2019年05月13日18:22:34
 **/
@Configuration
public class RestSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
    }
}
