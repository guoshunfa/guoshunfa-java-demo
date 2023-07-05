package code5.service.impl;

import code5.service.Shape;

/**
 * @className: Circle
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
