package code11.service.impl;

import code11.service.Shape;

/**
 * @className: Rectangle
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
