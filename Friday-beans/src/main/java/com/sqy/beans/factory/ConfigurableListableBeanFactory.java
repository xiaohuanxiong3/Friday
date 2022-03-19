package com.sqy.beans.factory;

import com.sqy.beans.BeansException;
import com.sqy.beans.factory.config.AutowireCapableBeanFactory;
import com.sqy.beans.factory.config.BeanDefinition;
import com.sqy.beans.factory.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;
}
