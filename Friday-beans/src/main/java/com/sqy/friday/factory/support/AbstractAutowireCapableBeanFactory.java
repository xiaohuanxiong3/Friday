package com.sqy.friday.factory.support;

import com.sqy.friday.BeansException;
import com.sqy.friday.factory.config.BeanDefinition;

import java.lang.reflect.InvocationTargetException;

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().getDeclaredConstructor().newInstance();
        } catch (InvocationTargetException | InstantiationException
                | IllegalAccessException | NoSuchMethodException e) {
            throw new BeansException("Instantiation of bean failed");
        }

        addSingleton(beanName,bean);
        return bean;
    }
}
