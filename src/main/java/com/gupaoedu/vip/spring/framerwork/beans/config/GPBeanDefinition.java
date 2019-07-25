package com.gupaoedu.vip.spring.framerwork.beans.config;

import com.sun.istack.internal.Nullable;
import lombok.Data;

/**
 * @ClassName BeanDefinition
 * @Description TODO
 * @Author xiong
 * @Date 2019/7/10 0010 16:49
 * @Version 1.0
 **/
@Data
public class GPBeanDefinition {

    private String beanClassName;
    private boolean lazyInit = false;
    private String factoryBeanName;
}
