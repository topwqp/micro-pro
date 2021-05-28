package com.xs.micro.up.config.bean;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author wqp
 */
@Configuration
@AutoConfigureAfter(SqlSessionFactory.class)
public class JavaBeanConfig {
    /**
     * Mybatis Mapper文件包名。
     */
    private static final String MYBATIS_MAPPER_PACKAGE = "com.xs.micro.up.domain.dao";

    /**
     * 配置Mybatis动态代理DAO接口
     *
     * @return
     */
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage(MYBATIS_MAPPER_PACKAGE);
        return mapperScannerConfigurer;
    }

    @Bean
    @Profile({"local", "dev", "test"})
    public AlwaysSampler defaultSampler() {
        return new AlwaysSampler();
    }


}
