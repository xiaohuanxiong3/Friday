package com.friday.test;

import com.friday.beans.factory.xml.XmlBeanDefinitionReader;
import com.friday.context.support.ClassPathXmlApplicationContext;
import com.friday.test.bean.UserService;
import com.friday.beans.factory.support.DefaultListableBeanFactory;
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
//        // 1.初始化 BeanFactory
//        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//        // 2.读取配置文件&注册Bean
//        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
//        beanDefinitionReader.loadBeanDefinitions("classpath:spring.xml");
//        // 3.获取Bean对象调用方法
//        UserService userService = (UserService) beanFactory.getBean("userService", UserService.class);
//        userService.queryUserInfo();
    }

    @Test
    public void test_ApplicationContext_xml(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.queryUserInfo();
        System.out.println(userService.toString());
    }

    @Test
    public void test_xml2(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.registerShutdownHook();

        // 2.获取Bean对象调用方法
        UserService userService = (UserService) applicationContext.getBean("userService");

        System.out.println(userService.toString());
    }

    @Test
    public void test_xml3(){
        // 1.初始化 ApplicationContext
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
//        applicationContext.registerShutdownHook();
//
//        UserService userService = applicationContext.getBean("userService",UserService.class);
//        userService.queryUserInfo();
//        System.out.println("BeanName:" + userService.getName());
//        System.out.println("BeanFactory:" + userService.getBeanFactory());
//        System.out.println("ClassLoader:" + userService.getClassLoader());
//        System.out.println("ApplicationContext:" + userService.getApplicationContext());
    }

    @Test
    public void test_prototype() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.registerShutdownHook();

        UserService userService1 = applicationContext.getBean("userService", UserService.class);
        UserService userService2 = applicationContext.getBean("userService", UserService.class);

        System.out.println(userService1);
        System.out.println(userService2);

        // 打印十六进制哈希值
        System.out.println(userService1 + " 十六进制哈希：" + Integer.toHexString(userService1.hashCode()));
        System.out.println(userService2 + " 十六进制哈希：" + Integer.toHexString(userService2.hashCode()));

    }

    @Test
    public void test_factory_bean() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.registerShutdownHook();

        UserService userService = applicationContext.getBean("userService", UserService.class);
        System.out.println("测试结果：" + userService.queryUserInfo());
    }
}
