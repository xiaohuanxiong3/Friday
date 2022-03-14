package com.sqy.beans.factory.support;

import com.sqy.beans.BeansException;
import com.sqy.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public interface InstantiationStrategy {

    Object instantiate(String beanName, BeanDefinition beanDefinition, Constructor constructor,
                       Object[] args) throws BeansException;
}
