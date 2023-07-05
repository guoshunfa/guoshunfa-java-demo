package code2.service.impl;

import code2.service.Color;

/**
 * @className: Blue
 * @author: GuoShunFa
 * @date: 2022/12/7
 **/
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
