package com.xs.micro.up.domain.service;

import com.xs.micro.up.config.bean.SelfDefinition;
import javafx.application.Application;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * @author wqp
 */
@Service
public class TestServiceImpl implements  TestService , ApplicationContextAware {

    private  ApplicationContext applicationContext;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = java.lang.RuntimeException.class)
    public void testInvoke() {
        Map<String, Object> objectMap = applicationContext.getBeansWithAnnotation(SelfDefinition.class);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
