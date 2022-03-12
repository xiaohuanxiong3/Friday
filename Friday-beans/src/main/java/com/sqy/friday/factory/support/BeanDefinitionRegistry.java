package com.sqy.friday.factory.support;

import com.sqy.friday.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {

    /**
     * 注册 BeanDefinition
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
