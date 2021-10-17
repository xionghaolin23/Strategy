package com.xionghl.adapter.prop;

/**
 * @Author:xionghl
 * @Date:2021/10/17 12:01 下午
 */
public class HashMapCache implements Cache{


    @Override
    public void get() {
        System.out.println("HashMap获取缓存。。。");
    }
}
