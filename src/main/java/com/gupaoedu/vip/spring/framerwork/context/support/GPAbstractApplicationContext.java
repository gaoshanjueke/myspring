package com.gupaoedu.vip.spring.framerwork.context.support;

/**
 * @ClassName GPAbstractApplicationContext
 * @Description IOC容器的顶层设计
 * @Author xiong
 * @Date 2019/7/10 0010 16:31
 * @Version 1.0
 **/
public abstract class GPAbstractApplicationContext {

    //这个类不能直接new，提供给子类去重写这个方法，这是规范
    protected void refresh(){}
}
