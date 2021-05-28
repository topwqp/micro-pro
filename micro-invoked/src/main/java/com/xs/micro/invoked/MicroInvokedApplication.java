package com.xs.micro.invoked;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.util.StopWatch;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description 微服务启动类
 * @Author Wang QiuPeng
 * @date 2019年10月15日18:13:24
 **/
@SpringBootApplication
@EnableHystrix
@EnableFeignClients
@EnableScheduling
@EnableSwagger2
@EnableEurekaClient
@EnableRetry
public class MicroInvokedApplication {

	private static final Logger LOG = LoggerFactory.getLogger(MicroInvokedApplication.class);

	/**
	 * 用户服务执行入口<br>
	 * 运行方式有三种：<br>
	 * 1、直接在IDE中Run as 或 Debug as。（调试过程） <br>
	 * 2、引入SpringBoot插件后通过 mvn spring-boot:run 运行（开发过程）
	 * 3、普通jar包方式运行，需要先执行Maven打包，再执行 java -jar xxx.jar(生产环境)
	 * @param args
	 */
	public static void main(String[] args) {
		StopWatch sw = new StopWatch();
		sw.start();
		SpringApplication.run(MicroInvokedApplication.class, args);
		sw.stop();
		LOG.info("--------------------------------------------------------");
		LOG.info("-------Service micro-invoked is started. cost:{} s -----", sw.getTotalTimeSeconds());
		LOG.info("--------------------------------------------------------");
	}
}
