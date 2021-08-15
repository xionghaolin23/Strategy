package com.xionghl.factory.dto;

import lombok.Data;

/**
 * @Author:xionghl
 * @Date:2021/8/15 3:17 下午
 * 短信参数
 */
@Data
public class SmsParam {

    //手机号码
    private String mobile;
    //短信厂商
    private String company;
}
