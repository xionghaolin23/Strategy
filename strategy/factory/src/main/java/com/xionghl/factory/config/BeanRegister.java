package com.xionghl.factory.config;

import com.xionghl.factory.provider.ZhenziyunSms;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.*;
import org.springframework.context.annotation.*;

/**
 * @Author:xionghl
 * @Date:2021/8/15 2:24 下午
 * 将实现类的bean注入（另外一种方式）
 */
@Configuration
@Slf4j
public class BeanRegister implements BeanDefinitionRegistryPostProcessor {


    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {

        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.rootBeanDefinition(ZhenziyunSms.class).getBeanDefinition();
        beanDefinitionRegistry.registerBeanDefinition("zhenziyunSms", beanDefinition);


    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

        log.warn("当前bean工厂中共有" + configurableListableBeanFactory.getBeanDefinitionCount() + "个");
        ZhenziyunSms bean = configurableListableBeanFactory.getBean(ZhenziyunSms.class);
        log.warn("榛子云短信的bean" + bean);
    }


}
