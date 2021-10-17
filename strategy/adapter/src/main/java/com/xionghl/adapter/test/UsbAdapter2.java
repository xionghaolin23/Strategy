package com.xionghl.adapter.test;

/**
 * USB 适配器  需要电脑USB和网线 所以此类需要和两个类打交道   一个是网线 extends Online
 *
 * @Author:xionghl
 * @Date:2021/10/17 11:15 上午
 */
public class UsbAdapter2 implements Transform {


    /**
     * 接入网线
     */
    private Online online;

    /**
     * 构造器初始化 在new 一个适配器的时候传递一个网线进来
     * @param online 网线
     */
    public UsbAdapter2(Online online) {
        this.online = online;
    }

    @Override
    public void handleRequest() {
        //上网
        online.online();
    }
}
