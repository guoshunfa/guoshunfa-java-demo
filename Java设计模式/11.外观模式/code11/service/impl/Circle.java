package code11.service.impl;

import code11.service.Shape;

/**
 * @className: Circle
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
