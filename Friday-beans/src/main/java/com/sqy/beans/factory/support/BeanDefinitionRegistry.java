package com.sqy.beans.factory.support;

import com.sqy.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {

    /**
     * 注册 BeanDefinition
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
