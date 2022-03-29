package com.friday.beans.factory;

import com.friday.beans.BeansException;

import java.util.Map;

public interface ListableBeanFactory extends BeanFactory{
    /**
     * 按照类型返回bean实例
     * @param type
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> Map<String,T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * Return the names of all beans defined in this registry
     *
     * 返回注册表中所有的bean名称
     * @return
     */
    String[] getBeanDefinitionNames();
}
