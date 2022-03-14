package com.sqy.beans.factory.support;

import com.sqy.beans.BeansException;
import com.sqy.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SimpleInstantiationStrategy implements InstantiationStrategy{

    @Override
    public Object instantiate(String beanName, BeanDefinition beanDefinition,
                              Constructor constructor, Object[] args) throws BeansException {
        Class clazz = beanDefinition.getBeanClass();
        try {
            if (constructor != null) {
                return clazz.getDeclaredConstructor(constructor.getParameterTypes()).newInstance(args);
            } else {
                return clazz.getDeclaredConstructor().newInstance();
            }
        } catch (InvocationTargetException | InstantiationException
                | IllegalAccessException | NoSuchMethodException e) {
            throw new BeansException("Failed to instantiate["+clazz.getName()+"]",e);
        }
    }
}
