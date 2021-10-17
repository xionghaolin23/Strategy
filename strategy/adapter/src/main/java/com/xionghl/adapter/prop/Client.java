package com.xionghl.adapter.prop;

/**
 * @Author:xionghl
 * @Date:2021/10/17 11:58 上午
 */
public class Client {

    /**
     * 客户端获取缓存
     *
     * @param cache 缓存接口
     */
    public void getCache(Cache cache) {
        cache.get();
    }

    public static void main(String[] args) {
        Client client = new Client();
        Cache cache = new RedisCache();
        client.getCache(cache);
    }
}
