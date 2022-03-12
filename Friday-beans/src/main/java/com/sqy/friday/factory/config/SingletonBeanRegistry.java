package com.sqy.friday.factory.config;

public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
