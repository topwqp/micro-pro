package com.xs.micro.up.domain.scan;

import com.xs.micro.up.config.bean.SelfDefinition;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wqp
 * @desc cat class
 */
@Component
@SelfDefinition(appName = "cat miao miao")
public class Cat extends  Animal implements Action{

    private static final Logger LOG = LoggerFactory.getLogger(Cat.class);

    public  void testInvoke(String message){

    }

    @Override
    @Transactional
    public void eat() {

    }
}
