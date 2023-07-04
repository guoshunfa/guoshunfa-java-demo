package code5.service.impl;

import code5.service.Shape;

/**
 * @className: Rectangle
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
