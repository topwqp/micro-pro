package com.xs.micro.up.partner;

import com.xiangshang360.middleware.sdk.entity.GlobalResponseEntity;
import com.xs.micro.up.partner.client.BusinessClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangqiupeng
 * @desc 调用saas-business服务
 * @date 2020年05月14日15:30:01
 */
@Service
@Slf4j
public class BusinessService {

    @Autowired
    private BusinessClient businessClient;

    public GlobalResponseEntity<Object> invokeTest() {
        GlobalResponseEntity<Object> responseEntity = businessClient.invoked();
        if (responseEntity == null || !responseEntity.ok()){
            log.info("loanTrans responseEntity code is {}, msg is {}",responseEntity.getCode(),responseEntity.getMsg());
        }
        return responseEntity;
    }
}
