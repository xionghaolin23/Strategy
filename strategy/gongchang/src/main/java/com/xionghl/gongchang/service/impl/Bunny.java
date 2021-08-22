package com.xionghl.gongchang.service.impl;

import com.xionghl.gongchang.service.Animals;

/**
 * @Author:xionghl
 * @Date:2021/8/22 4:24 下午
 */
public class Bunny implements Animals {
    @Override
    public void eat() {
        System.out.println("兔子吃草");
    }
}
