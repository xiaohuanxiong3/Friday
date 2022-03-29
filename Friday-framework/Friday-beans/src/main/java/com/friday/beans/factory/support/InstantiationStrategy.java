package com.friday.beans.factory.support;

import com.friday.beans.BeansException;
import com.friday.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public interface InstantiationStrategy {

    Object instantiate(String beanName, BeanDefinition beanDefinition, Constructor constructor,
                       Object[] args) throws BeansException;
}
