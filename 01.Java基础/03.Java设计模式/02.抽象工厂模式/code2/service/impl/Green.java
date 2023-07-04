package code2.service.impl;

import code2.service.Color;

/**
 * @className: Green
 * @author: GuoShunFa
 * @date: 2022/12/7
 **/
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
