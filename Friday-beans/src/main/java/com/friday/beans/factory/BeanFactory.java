package com.friday.beans.factory;

import com.friday.beans.BeansException;

public interface BeanFactory {
    //private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

     Object getBean(String name) throws BeansException;

     Object getBean(String name,Object... args) throws BeansException;

     <T> T getBean(String name,Class<T> requiredType) throws BeansException;

//    public void registerBeanDefinition(String beanName,BeanDefinition beanDefinition){
//        beanDefinitionMap.put(beanName,beanDefinition);
//    }
}
