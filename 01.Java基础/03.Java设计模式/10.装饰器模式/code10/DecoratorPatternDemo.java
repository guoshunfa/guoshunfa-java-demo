package code10;

import code10.service.Shape;
import code10.service.impl.Circle;
import code10.service.impl.Rectangle;
import code10.service.impl.RedShapeDecorator;
import code10.service.impl.ShapeDecorator;

/**
 * @className: DecoratorPatternDemo
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        //Shape redCircle = new RedShapeDecorator(new Circle());
        //Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
