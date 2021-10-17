package com.xionghl.adapter.controller;

import com.xionghl.adapter.service.impl.AudioPlayer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:xionghl
 * @Date:2021/10/17 10:36 上午
 */
@RestController
public class Test {

    AudioPlayer audioPlayer = new AudioPlayer();



    /**
     * 统一暴露接口 使用自动播放器  来播放不同类型的音频格式
     *
     * @param audioType 需要播放的格式 mp3
     * @param fileName  文件名  xionghl.mp3
     */
    @RequestMapping("play")
    public void play(String audioType, String fileName) {
        //
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
