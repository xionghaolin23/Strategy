package com.xionghl.gongchang.service.impl;

import com.xionghl.gongchang.service.Animals;

/**
 * @Author:xionghl
 * @Date:2021/8/22 4:23 下午
 */
public class Tiger implements Animals {

    @Override
    public void eat() {
        System.out.println("老虎吃肉");
    }
}
