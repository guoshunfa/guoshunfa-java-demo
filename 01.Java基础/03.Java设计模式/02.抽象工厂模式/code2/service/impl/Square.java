package code2.service.impl;

import code2.service.Shape;

/**
 * @className: Square
 * @author: GuoShunFa
 * @date: 2022/12/7
 **/
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
