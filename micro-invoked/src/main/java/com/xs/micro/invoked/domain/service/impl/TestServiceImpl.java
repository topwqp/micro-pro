package com.xs.micro.invoked.domain.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author wqp
 * @date 2021年03月23日11:39:39
 * @desc
 */
@Service
@Slf4j
public class TestServiceImpl {

    public void testService(){
        log.info("test service do something");
    }
}
