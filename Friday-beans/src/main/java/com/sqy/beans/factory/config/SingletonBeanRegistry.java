package com.sqy.beans.factory.config;

public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
