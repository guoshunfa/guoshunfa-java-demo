package code1.service.impl;

import code1.service.Shape;

/**
 * @className: Circle
 * @author: GuoShunFa
 * @date: 2022/12/7
 **/
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
