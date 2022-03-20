package com.friday.beans.factory;

import com.friday.beans.BeansException;
import com.friday.beans.factory.config.BeanDefinition;
import com.friday.beans.factory.config.ConfigurableBeanFactory;
import com.friday.beans.factory.config.AutowireCapableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;
}
