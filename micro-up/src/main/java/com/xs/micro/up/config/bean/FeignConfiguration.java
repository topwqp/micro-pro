package com.xs.micro.up.config.bean;

import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Bean;

/**
 * @description feign超时时间设置，用于采用URL调用三方服务的配置
 * @author Wang Qiu Peng
 * @date 2020年05月15日11:13:06
 **/
public class FeignConfiguration {

    private static final String TENANT_HEADER = "X-TenantID";

    private static final String LANG = "lang";

    @Bean
    Request.Options feignOperation(){
        return new Request.Options(30*1000,150*1000);
    }

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

}
