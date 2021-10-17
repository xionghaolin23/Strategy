package com.xionghl.adapter.service.impl;

import com.xionghl.adapter.service.AdvancedMediaPlayer;

/**
 * @Author:xionghl
 * @Date:2021/10/17 10:01 上午
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
