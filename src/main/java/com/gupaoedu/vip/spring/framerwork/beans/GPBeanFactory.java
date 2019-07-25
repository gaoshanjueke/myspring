package com.gupaoedu.vip.spring.framerwork.beans;

/**
 * @ClassName GPBeanFactory
 * @Description TODO
 * @Author xiong
 * @Date 2019/7/10 0010 16:07
 * @Version 1.0
 **/
public interface GPBeanFactory {

    /**
     * 根据beanName从容器中获取一个实例Bean
     * @param beanName
     * @return
     */
    Object getBean(String beanName);
}
