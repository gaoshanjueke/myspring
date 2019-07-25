package com.gupaoedu.vip.spring.framerwork.context;

import com.gupaoedu.vip.spring.framerwork.beans.GPBeanFactory;
import com.gupaoedu.vip.spring.framerwork.beans.config.GPBeanDefinition;
import com.gupaoedu.vip.spring.framerwork.beans.support.GPBeanDefinitionReader;
import com.gupaoedu.vip.spring.framerwork.beans.support.GPDefaultListableBeanFactory;

import java.util.List;

/**
 * @ClassName GPApplicationContext
 * @Description TODO
 * @Author xiong
 * @Date 2019/7/10 0010 16:12
 * @Version 1.0
 **/
public class GPApplicationContext extends GPDefaultListableBeanFactory implements GPBeanFactory {

    /**
     * @Description
     * @Author xionge
     * @Date 2019/7/25 0025 15:53
     * @Param
     * @Return
     */
    private String[] configLocations;

    GPBeanDefinitionReader reader;

    public GPApplicationContext(String... configLocations){
        this.configLocations = configLocations;
    }

    @Override
    protected void refresh() {
        //1、定位配置文件
        reader = new GPBeanDefinitionReader(this.configLocations);
        //2、加载配置文件，扫描相关的类，把他们封装成BeanDefinition
        List<GPBeanDefinition> definitions = reader.loadBeanDefinitions();
        //3、注册，把配置信息放到容器里面（伪IOC容器）
        doRegisterBeanDefinition(definitions);
        // 4、把不是延时加载的类提前初始化
        doAutoWired();
    }

    private void doAutoWired() {
    }

    private void doRegisterBeanDefinition(List<GPBeanDefinition> definitions) {
    }

    @Override
    public Object getBean(String beanName) {
        return null;
    }
}
