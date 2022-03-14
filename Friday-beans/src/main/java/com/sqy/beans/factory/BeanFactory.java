package com.sqy.beans.factory;

import com.sqy.beans.BeansException;

public interface BeanFactory {
    //private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

     Object getBean(String name) throws BeansException;

     Object getBean(String name,Object... args) throws BeansException;

//    public void registerBeanDefinition(String beanName,BeanDefinition beanDefinition){
//        beanDefinitionMap.put(beanName,beanDefinition);
//    }
}
