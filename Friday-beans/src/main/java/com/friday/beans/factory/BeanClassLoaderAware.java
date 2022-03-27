package com.friday.beans.factory;

import com.friday.beans.factory.Aware;

public interface BeanClassLoaderAware extends Aware {

    void setBeanClassLoader(ClassLoader classLoader);
}
