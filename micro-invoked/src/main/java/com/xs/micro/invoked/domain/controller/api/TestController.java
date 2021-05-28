package com.xs.micro.invoked.domain.controller.api;

import com.xiangshang360.middleware.sdk.entity.GlobalResponseEntity;
import com.xs.micro.invoked.domain.service.impl.TestServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author wangqiupeng
 * @desc test
 * @date 2020年06月15日17:07:44
 */

@RestController
@RequestMapping(value = "/test")
public class TestController {
    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);


    @Autowired
    private TestServiceImpl testService;

    @RequestMapping(value = "/invoked",method = RequestMethod.POST)
    public GlobalResponseEntity invoked(){
        LOG.info("invoke test requestData is {}  .....");
        try {
            testService.testService();
        }catch (Exception e){
            LOG.error("invoke fail ");
        }
        return GlobalResponseEntity.success();
    }


}
