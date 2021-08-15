package com.xionghl.factory.provider;

import com.aliyun.dysmsapi20170525.models.SendSmsRequest;
import com.aliyun.dysmsapi20170525.models.SendSmsResponse;
import com.aliyun.dysmsapi20170525.models.SendSmsResponseBody;
import com.aliyun.teaopenapi.models.Config;
import com.xionghl.factory.handle.SmsHander;
import org.springframework.stereotype.Component;

/**
 * @Author:xionghl
 * @Date:2021/8/15 12:02 下午
 * 阿里云短信厂商
 */
@Component
public class AliyunSms implements SmsHander {

    /**
     * 使用AK&SK初始化账号Client
     *
     * @param accessKeyId
     * @param accessKeySecret
     * @return Client
     * @throws Exception
     */
    public static com.aliyun.dysmsapi20170525.Client createClient(String accessKeyId, String accessKeySecret) throws Exception {
        Config config = new Config()
                // 您的AccessKey ID
                .setAccessKeyId(accessKeyId)
                // 您的AccessKey Secret
                .setAccessKeySecret(accessKeySecret);
        // 访问的域名
        config.endpoint = "dysmsapi.aliyuncs.com";
        return new com.aliyun.dysmsapi20170525.Client(config);
    }

    @Override
    public String sendSms(String mobile) {
        com.aliyun.dysmsapi20170525.Client client = null;
        try {
            client = AliyunSms.createClient("", "");
            SendSmsRequest sendSmsRequest = new SendSmsRequest()
                    //手机号码
                    .setPhoneNumbers("")
                    //签名
                    .setSignName("")
                    //短信模版
                    .setTemplateCode("")
                    //变量值
                    .setTemplateParam("151515");
            SendSmsResponse sendSmsResponse = client.sendSms(sendSmsRequest);
            SendSmsResponseBody body = sendSmsResponse.getBody();
            return body.message;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
