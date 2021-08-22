package com.xionghl.factory.controller;

import com.xionghl.factory.config.BeanConfig;
import com.xionghl.factory.dto.SmsParam;
import com.xionghl.factory.handle.SmsHander;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:xionghl
 * @Date:2021/8/15 11:46 上午
 */
@RestController
@Slf4j
public class SendSmsController {

    @Autowired
    private BeanConfig beanConfig;


    /**
     * 发送短信
     *
     * @param smsParam
     * @return
     */
    @RequestMapping("sendSms")
    public String sendSms(@RequestBody SmsParam smsParam) {
        //获取对应短信厂商的实现
        SmsHander smsHander = beanConfig.createSmsService(smsParam.getCompany());
        log.warn("短信厂商{}", smsHander);
        return smsHander.sendSms(smsParam.getMobile());
    }


}
