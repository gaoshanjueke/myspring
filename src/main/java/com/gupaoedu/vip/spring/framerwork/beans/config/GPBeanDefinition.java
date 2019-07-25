package com.gupaoedu.vip.spring.framerwork.beans.config;

import com.sun.istack.internal.Nullable;

/**
 * @ClassName BeanDefinition
 * @Description TODO
 * @Author xiong
 * @Date 2019/7/10 0010 16:49
 * @Version 1.0
 **/
public class GPBeanDefinition {

    private String beanClassName;

    void setBeanClassName(@Nullable String beanClassName){}

    boolean isLazyInit(){
        return false;
    }

    void setFactoryBeanName(@Nullable String factoryBeanName){}
}
