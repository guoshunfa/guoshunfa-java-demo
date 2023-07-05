package code10.service.impl;

import code10.service.Shape;

/**
 * @className: RedShapeDecorator
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
