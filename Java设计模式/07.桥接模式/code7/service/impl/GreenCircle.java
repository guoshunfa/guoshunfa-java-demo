package code7.service.impl;

import code7.service.DrawAPI;

/**
 * @className: GreenCircle
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
