package com.sqy.test;

import com.sqy.friday.bean.UserService;
import com.sqy.friday.factory.BeanDefinition;
import com.sqy.friday.factory.BeanFactory;
import org.junit.Test;

public class apiTest {

    @Test
    public void test_BeanFactory(){
        // 1.初始化beanFactory
        BeanFactory beanFactory = new BeanFactory();
        // 2.注册userService
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        // 3.注册beanDefinition
        beanFactory.registerBeanDefinition("UserService",beanDefinition);
        // 4.获取bean
        UserService userService = (UserService) beanFactory.getBean("UserService");
        userService.queryUserInfo();
    }
}
