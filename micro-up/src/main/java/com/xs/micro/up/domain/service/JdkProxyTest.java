package com.xs.micro.up.domain.service;


import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

/**
 * @author wqp
 */
@Slf4j
public class JdkProxyTest {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> proxyClass= Proxy.getProxyClass(JdkProxyTest.class.getClassLoader(),Click.class);
        final Constructor<?> cons = proxyClass.getConstructor(InvocationHandler.class);
        final InvocationHandler ih = new ClickInvokerHandler(new ClickImpl());
        Click click= (Click)cons.newInstance(ih);
        click.click();

        log.info("--------------------------------");
        Click click1=(Click)Proxy.
                newProxyInstance(JdkProxyTest.class.getClassLoader(),
                        new Class<?>[]{Click.class},
                        new ClickInvokerHandler(new ClickImpl()));
        click1.click();
    }
}
