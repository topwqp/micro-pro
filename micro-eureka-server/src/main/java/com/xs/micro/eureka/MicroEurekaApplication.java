package com.xs.micro.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.util.StopWatch;

@SpringBootApplication
@EnableEurekaServer
public class MicroEurekaApplication {

	private static final Logger LOG = LoggerFactory.getLogger(MicroEurekaApplication.class);

	public static void main(String[] args) {
		StopWatch sw = new StopWatch();
		sw.start();
		SpringApplication.run(MicroEurekaApplication.class, args);
		sw.stop();

		LOG.info("--------------------------------------------------------");
		LOG.info("------------Service is started. cost:{} s---------------", sw.getTotalTimeSeconds());
		LOG.info("--------------------------------------------------------");
	}
}
