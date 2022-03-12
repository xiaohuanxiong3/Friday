package com.sqy.friday.factory;

import com.sqy.friday.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public interface BeanFactory {
    //private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

     Object getBean(String name);

//    public void registerBeanDefinition(String beanName,BeanDefinition beanDefinition){
//        beanDefinitionMap.put(beanName,beanDefinition);
//    }
}
