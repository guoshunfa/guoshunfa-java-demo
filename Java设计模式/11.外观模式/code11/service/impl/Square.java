package code11.service.impl;

import code11.service.Shape;

/**
 * @className: Square
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
