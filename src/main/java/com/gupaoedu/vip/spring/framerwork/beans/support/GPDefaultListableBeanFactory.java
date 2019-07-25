package com.gupaoedu.vip.spring.framerwork.beans.support;

import com.gupaoedu.vip.spring.framerwork.beans.config.GPBeanDefinition;
import com.gupaoedu.vip.spring.framerwork.context.support.GPAbstractApplicationContext;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName GPDefaultListableBeanFactory
 * @Description TODO
 * @Author xiong
 * @Date 2019/7/10 0010 16:38
 * @Version 1.0
 **/
public class GPDefaultListableBeanFactory extends GPAbstractApplicationContext {
    private final Map<String, GPBeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();
}
