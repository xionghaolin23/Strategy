package com.xionghl.factory.handle;

/**
 * @Author:xionghl
 * @Date:2021/8/15 12:52 下午
 * 短信接口 拓展点
 */
public interface SmsHander {

    /**
     * 发送短信接口
     *
     * @param mobile 手机号码
     * @return
     */
    String sendSms(String mobile);
}
