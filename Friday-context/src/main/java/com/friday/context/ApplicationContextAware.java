package com.friday.context;

import com.friday.beans.BeansException;
import com.friday.beans.factory.Aware;

public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}
