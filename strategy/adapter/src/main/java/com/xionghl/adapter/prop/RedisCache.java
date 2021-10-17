package com.xionghl.adapter.prop;

/**
 * @Author:xionghl
 * @Date:2021/10/17 12:01 下午
 */
public class RedisCache implements Cache{



    public RedisCache() {
    }

    /**
     * 获取缓存
     */
    @Override
    public void get() {
        System.out.println("redis获取缓存。。。");
    }
}
