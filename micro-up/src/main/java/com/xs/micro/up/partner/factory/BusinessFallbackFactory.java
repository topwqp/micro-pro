package com.xs.micro.up.partner.factory;

import com.xiangshang360.middleware.sdk.entity.GlobalResponseEntity;
import com.xs.micro.up.extension.util.OperationLogUtils;
import com.xs.micro.up.partner.client.BusinessClient;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @Description: invoke saas  business  occur error callback
 * @Author Wang QiuPeng
 * @Date  2020年05月14日15:39:37
 */
@Service
public class BusinessFallbackFactory implements FallbackFactory<BusinessClient> {

    private static final Logger LOG = LoggerFactory.getLogger(BusinessFallbackFactory.class);

    @Override
    public BusinessClient create(Throwable throwable) {
        return () -> {
            LOG.error("invoke invokeTest is fail,json:{} ", throwable);
            LOG.error(OperationLogUtils.logContent("selfAccountTransferToUser is fail ", new String("124"),throwable));
            return   GlobalResponseEntity.failure(String.format("invoke invokeTest is fail"));
        };
    }


}
