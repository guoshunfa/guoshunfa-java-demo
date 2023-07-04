package code10.service.impl;

import code10.service.Shape;

/**
 * @className: ShapeDecorator
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
