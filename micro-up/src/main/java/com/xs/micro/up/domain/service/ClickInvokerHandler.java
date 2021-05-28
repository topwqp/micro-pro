package com.xs.micro.up.domain.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author topwqp
 */
public class ClickInvokerHandler implements InvocationHandler {

    private Object target;
    public ClickInvokerHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target,args);
    }


}
