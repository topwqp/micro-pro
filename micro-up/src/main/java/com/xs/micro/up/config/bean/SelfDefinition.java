package com.xs.micro.up.config.bean;

import java.lang.annotation.*;

/**
 * @author topwqp
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface SelfDefinition {
    /**
     * 名称
     * @return
     */
    public abstract String appName();
}
