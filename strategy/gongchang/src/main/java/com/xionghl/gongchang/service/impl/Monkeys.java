package com.xionghl.gongchang.service.impl;

import com.xionghl.gongchang.service.Animals;

/**
 * @Author:xionghl
 * @Date:2021/8/22 4:25 下午
 */
public class Monkeys implements Animals {
    @Override
    public void eat() {
        System.out.println("猴子吃香蕉");
    }
}
