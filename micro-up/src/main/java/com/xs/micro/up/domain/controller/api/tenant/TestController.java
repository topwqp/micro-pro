package com.xs.micro.up.domain.controller.api.tenant;

import com.alibaba.fastjson.JSON;
import com.xiangshang360.middleware.sdk.util.CalendarUtil;
import com.xs.micro.up.config.bean.SelfDefinition;
import com.xs.micro.up.domain.pojo.model.UserInfo;
import com.xs.micro.up.domain.scan.Animal;
import com.xs.micro.up.domain.service.TestService;
import com.xs.micro.up.domain.service.TestServiceImpl;
import com.xs.micro.up.domain.service.UserInfoService;
import com.xs.micro.up.extension.RedisCache;
import com.xs.micro.up.extension.util.OperationLogUtils;
import com.xs.micro.up.partner.BusinessService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.session.SessionProperties;
import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author wangqiupeng
 * @desc test mongo connection ssl
 * @date 2020年06月15日17:07:44
 */

@RestController
@RequestMapping(value = "/test")
public class TestController   {
    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private BusinessService businessService;


    @RequestMapping(value = "/testLog", method = RequestMethod.GET)
    public String testLog() {
        LOG.info("test log start");
        businessService.invokeTest();
        return "success";
    }
}
