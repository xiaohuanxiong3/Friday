package com.friday.test.config;

import com.friday.beans.BeansException;
import com.friday.beans.factory.config.BeanPostProcessor;
import com.friday.test.bean.UserService;

public class CustomBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行：postProcessBeforeInitialization...");
        if ("userService".equals(beanName)) {
            UserService userService = (UserService) bean;
            userService.setLocation("还是南京");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行：postProcessAfterInitialization...");
        return bean;
    }
}
