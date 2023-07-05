package code2.service.impl;

import code2.service.Shape;

/**
 * @className: Rectangle
 * @author: GuoShunFa
 * @date: 2022/12/7
 **/
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
