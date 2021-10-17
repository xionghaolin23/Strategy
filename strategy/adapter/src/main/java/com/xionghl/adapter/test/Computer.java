package com.xionghl.adapter.test;

/**
 * @Author:xionghl
 * @Date:2021/10/17 11:02 上午
 */
public class Computer {

    /**
     * 客户端类  电脑 需要上网（但是插不上网线）所以需要买一个转接头（传递一个转接头的参数）
     */
    public void net(Transform transform) {
        //上网的具体实现  需要找一个转接头 这个转接头可以抽象成接口 因为一个接口下可以有很多不同实现（一个转接头可以有很多不同的转接口）
        transform.handleRequest();
    }

    public static void main(String[] args) {
        //模拟上网 需要电脑 适配器 网线
        //类适配器模式
        Computer computer = new Computer();
        Transform transform = new UsbAdapter();
        Online online = new Online();
        // 此时的 online 对象并没有用到 因为适配器 UsbAdapter 直接 extend Online 等于有了上网功能
        computer.net(transform);
        System.out.println("========第二种方法 (推荐使用)=======");
        // 对象适配器模式
        Computer computer2 = new Computer();
        Online online2 = new Online();
        Transform transform2 = new UsbAdapter2(online2);
        computer2.net(transform2);
    }
}
