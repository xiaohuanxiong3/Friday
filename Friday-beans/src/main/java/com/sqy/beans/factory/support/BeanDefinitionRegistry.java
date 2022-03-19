package com.sqy.beans.factory.support;

import com.sqy.beans.BeansException;
import com.sqy.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {

    /**
     * 注册 BeanDefinition
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     * 通过Bean名称查询BeanDefinition
     * @param name
     * @return
     * @throws BeansException
     */
    BeanDefinition getBeanDefinition(String name) throws BeansException;

    /**
     * 判断是否包含指定名称的BeanDefinition
     * @param beanName
     * @return
     */
    boolean containsBeanDefinition(String beanName);

    /**
     * 返回注册表中的所有Bean名称
     * @return
     */
    String[] getBeanDefinitionNames();
}
