package code6.service.impl;

import code6.service.AdvancedMediaPlayer;

/**
 * @className: VlcPlayer
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
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
