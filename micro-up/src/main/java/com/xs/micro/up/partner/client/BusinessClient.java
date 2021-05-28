package com.xs.micro.up.partner.client;

import com.xiangshang360.middleware.sdk.entity.GlobalResponseEntity;
import com.xs.micro.up.config.bean.FeignConfiguration;
import com.xs.micro.up.partner.factory.BusinessFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;


/**
 * @author wangqiupeng
 * @desc 调用saas-business系统
 * @date 2020年05月14日15:32:53
 */
@FeignClient(name="micro-invoked",fallbackFactory = BusinessFallbackFactory.class,configuration = FeignConfiguration.class)
public interface BusinessClient {

    /**
     * 调用三方处理
     * @return
     */
    @RequestMapping(value = "/test/invoked", method = RequestMethod.POST)
    GlobalResponseEntity<Object> invoked();
}


