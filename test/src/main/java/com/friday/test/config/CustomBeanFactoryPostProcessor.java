package com.friday.test.config;

import com.friday.beans.BeansException;
import com.friday.beans.PropertyValue;
import com.friday.beans.PropertyValues;
import com.friday.beans.factory.ConfigurableListableBeanFactory;
import com.friday.beans.factory.config.BeanDefinition;
import com.friday.beans.factory.config.BeanFactoryPostProcessor;

public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("执行：postProcessBeanFactory...");
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("company","改为：DXC-Technology"));
    }
}
