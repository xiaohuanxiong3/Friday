package com.sqy.beans.factory.support;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ClassUtil;
import com.sqy.beans.BeansException;
import com.sqy.beans.PropertyValue;
import com.sqy.beans.PropertyValues;
import com.sqy.beans.factory.config.BeanDefinition;
import com.sqy.beans.factory.config.BeanReference;

import java.lang.reflect.Constructor;

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{
    private InstantiationStrategy instantiationStrategy = new CglibSubclassingInstantiationStrategy();

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException {
        Object bean = null;
        try {
            bean = createBeanInstance(beanName,beanDefinition,args);
            // 给bean填充属性
            applyPropertyValues(beanName,bean,beanDefinition);
        } catch (Exception e) {
            throw new BeansException("Instantiation of bean failed",e);
        }

        addSingleton(beanName,bean);
        return bean;
    }

    protected Object createBeanInstance(String beanName,BeanDefinition beanDefinition,Object[] args) {
        Constructor constructorToUse = null;
        Class<?> beanClass = beanDefinition.getBeanClass();
        Constructor<?>[] declaredConstructors = beanClass.getDeclaredConstructors();
        for (Constructor ctor : declaredConstructors) {
            if (args != null && ctor.getParameterTypes().length == args.length) {
                constructorToUse = ctor;
                break;
            }
        }
        return getInstantiationStrategy().instantiate(beanName,beanDefinition,constructorToUse,args);
    }

    protected void applyPropertyValues(String beanName,Object bean,BeanDefinition beanDefinition) {
        try {
            PropertyValues propertyValues = beanDefinition.getPropertyValues();
            for (PropertyValue propertyValue : propertyValues.getPropertyValues()) {
                String name = propertyValue.getName();
                Object value = propertyValue.getValue();
                if (value instanceof BeanReference) {
                    // A依赖B，获取B的实例化
                    BeanReference beanReference = (BeanReference) value;
                    value = getBean(beanReference.getBeanName());
                }
                // 属性填充
                BeanUtil.setFieldValue(bean,name,value);
            }
        } catch (Exception e) {
            throw new BeansException("Error setting property values:" + beanName);
        }
    }

    public InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }

    public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy) {
        this.instantiationStrategy = instantiationStrategy;
    }
}
