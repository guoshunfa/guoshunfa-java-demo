package code5.service.impl;

import code5.service.Shape;

/**
 * @className: Square
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
