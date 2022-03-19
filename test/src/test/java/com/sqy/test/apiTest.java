package com.sqy.test;

import com.sqy.beans.PropertyValue;
import com.sqy.beans.PropertyValues;
import com.sqy.beans.factory.xml.XmlBeanDefinitionReader;
import com.sqy.test.bean.UserDao;
import com.sqy.test.bean.UserService;
import com.sqy.beans.factory.config.BeanDefinition;
import com.sqy.beans.factory.config.BeanReference;
import com.sqy.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

public class apiTest {

    @Test
    public void test_BeanFactory_1(){
//        // 1.初始化beanFactory
//        BeanFactory beanFactory = new BeanFactory();
//        // 2.注册userService
//        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
//        // 3.注册beanDefinition
//        beanFactory.registerBeanDefinition("UserService",beanDefinition);
//        // 4.获取bean
//        UserService userService = (UserService) beanFactory.getBean("UserService");
//        userService.queryUserInfo();
    }

    @Test
    public void test_BeanFactory_2(){
//        // 1.初始化 BeanFactory
//        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//        // 2.注册bean
//        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
//        beanFactory.registerBeanDefinition("UserService",beanDefinition);
//        // 3.第一次获取bean
//        UserService userService = (UserService) beanFactory.getBean("UserService");
//        userService.queryUserInfo();
//        // 4.第二次获取bean from singletonFactory
//        UserService userServiceSingleton = (UserService) beanFactory.getBean("UserService");
//        userServiceSingleton.queryUserInfo();
    }

    @Test
    public void test_BeanFactory_3(){
//        // 1.初始化beanFactory
//        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//        // 2.注入bean
//        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
//        beanFactory.registerBeanDefinition("userService",beanDefinition);
//        // 3.获取bean
//        UserService userService = (UserService) beanFactory.getBean("userService", "sqy");
//        userService.queryUserInfo();
//        UserService userService_debug = (UserService) beanFactory.getBean("userService", "sjj");
//        userService_debug.queryUserInfo();
    }

    @Test
    public void test_BeanFactory_4(){
//        // 1.初始化 BeanFactory
//        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//        // 2.UserDao 注册
//        beanFactory.registerBeanDefinition("userDao",new BeanDefinition(UserDao.class));
//        // 3.UserService 设置属性[userId,userDao]
//        PropertyValues propertyValues = new PropertyValues();
//        propertyValues.addPropertyValue(new PropertyValue("userId","10002"));
//        propertyValues.addPropertyValue(new PropertyValue("userDao",new BeanReference("userDao")));
//        // 4.UserService 注入bean
//        BeanDefinition beanDefinition = new BeanDefinition(UserService.class,propertyValues);
//        beanFactory.registerBeanDefinition("userService",beanDefinition);
//        // 5.UserService 获取bean
//        UserService userService = (UserService) beanFactory.getBean("userService");
//        userService.queryUserInfo();
    }

    @Test
    public void test_xml(){
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2.读取配置文件&注册Bean
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions("classpath:spring.xml");
        // 3.获取Bean对象调用方法
        UserService userService = (UserService) beanFactory.getBean("userService", UserService.class);
        userService.queryUserInfo();
    }
}
