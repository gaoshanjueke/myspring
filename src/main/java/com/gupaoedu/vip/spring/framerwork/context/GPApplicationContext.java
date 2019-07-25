package com.gupaoedu.vip.spring.framerwork.context;

import com.gupaoedu.vip.spring.framerwork.beans.GPBeanFactory;
import com.gupaoedu.vip.spring.framerwork.beans.support.GPDefaultListableBeanFactory;

/**
 * @ClassName GPApplicationContext
 * @Description TODO
 * @Author xiong
 * @Date 2019/7/10 0010 16:12
 * @Version 1.0
 **/
public class GPApplicationContext extends GPDefaultListableBeanFactory implements GPBeanFactory {

    @Override
    public Object getBean(String beanName) {
        return null;
    }
}
