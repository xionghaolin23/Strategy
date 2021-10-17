package com.xionghl.adapter.test;

/** USB 适配器  需要电脑USB和网线 所以此类需要和两个类打交道   一个是网线 extends Online
 * @Author:xionghl
 * @Date:2021/10/17 11:15 上午
 */
public class UsbAdapter extends Online implements Transform{

    @Override
    public void handleRequest() {
        //上网
        super.online();
    }
}
