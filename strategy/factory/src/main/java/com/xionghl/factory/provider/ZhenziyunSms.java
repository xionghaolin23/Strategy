package com.xionghl.factory.provider;

import com.xionghl.factory.handle.SmsHander;
import com.zhenzi.sms.ZhenziSmsClient;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @Author:xionghl
 * @Date:2021/8/15 11:22 上午
 * 榛子云短信厂商
 */
@Component
public class ZhenziyunSms implements SmsHander {


    //短信平台相关参数
    private final static String API_URL = "http://sms_developer.zhenzikj.com";
    private final static String APP_ID = "102365";
    private final static String APP_SECRET = "bc0a7782-34c1-43fb-97ca-67361f7c9429";

    /**
     * @param mobile 手机号码
     */
    @Override
    public String sendSms(String mobile)  {

        ZhenziSmsClient client = new ZhenziSmsClient(API_URL, APP_ID, APP_SECRET);
        Map<String, Object> params = new HashMap();
        params.put("number", mobile);
        //短信模板ID，登录用户中心，在"短信管理->短信模板"中创建，并查看
        params.put("templateId", APP_ID);
        //短信模板参数 templateParams
        //生成6位验证码
        String verifyCode = String.valueOf(new Random().nextInt(899999) + 100000);
        params.put("templateParams", verifyCode);
        String result = null;
        try {
            result = client.send(params);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
