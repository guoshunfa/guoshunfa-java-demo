package code6.service.impl;

import code6.service.AdvancedMediaPlayer;

/**
 * @className: Mp4Player
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
