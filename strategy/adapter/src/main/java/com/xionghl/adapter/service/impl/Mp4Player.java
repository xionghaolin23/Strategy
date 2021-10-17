package com.xionghl.adapter.service.impl;

import com.xionghl.adapter.service.AdvancedMediaPlayer;

/**
 * @Author:xionghl
 * @Date:2021/10/17 10:02 上午
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
