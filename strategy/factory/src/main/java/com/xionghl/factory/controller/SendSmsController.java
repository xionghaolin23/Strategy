package com.xionghl.factory.controller;

import com.xionghl.factory.provider.ZhenziyunSms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:xionghl
 * @Date:2021/8/15 11:46 上午
 */
@RestController
public class SendSmsController {

    @Autowired
    private ZhenziyunSms zhenziyunSms;

    @RequestMapping("sendSms")
    public String sendSms(@RequestBody String mobile){

        return zhenziyunSms.sendSms(mobile);
    }


}
