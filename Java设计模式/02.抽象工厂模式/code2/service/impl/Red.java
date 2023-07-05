package code2.service.impl;

import code2.service.Color;

/**
 * @className: Red
 * @author: GuoShunFa
 * @date: 2022/12/7
 **/
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
