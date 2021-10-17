package com.xionghl.adapter.service;

/**
 * @author xionghaolin
 */
public interface AdvancedMediaPlayer {
    /**
     * 播放 vlc 格式的文件。
     * @param fileName 文件名
     */
    public void playVlc(String fileName);

    /**
     * 播放mp4 格式的文件。
     *
     * @param fileName 文件名
     */
    public void playMp4(String fileName);
}
