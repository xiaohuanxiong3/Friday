package com.friday.beans.factory;

import com.friday.beans.BeansException;

public interface BeanFactoryAware extends Aware{

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
