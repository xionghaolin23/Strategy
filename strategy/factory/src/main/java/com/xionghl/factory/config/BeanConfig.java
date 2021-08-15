package com.xionghl.factory.config;

import com.xionghl.factory.handle.SmsHander;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:xionghl
 * @Date:2021/8/15 3:04 下午
 * 注册bean 取bean
 */
@Component
public class BeanConfig implements InitializingBean, ApplicationContextAware {

    private Map<String, SmsHander> queryServiceImplMap = new HashMap<>();
    private ApplicationContext applicationContext;

    public SmsHander createSmsService(String type) {

        SmsHander smsHander = queryServiceImplMap.get(type);
        if (smsHander != null) {
            return smsHander;
        }
        return null;
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        Map<String, SmsHander> beanMap = applicationContext.getBeansOfType(SmsHander.class);
        //遍历该接口的所有实现，将其放入map中
        for (SmsHander serviceImpl : beanMap.values()) {
            queryServiceImplMap.put(serviceImpl.getClass().getSimpleName(), serviceImpl);
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

}
