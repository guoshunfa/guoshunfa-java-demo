package code12.factory;

import code12.service.Shape;
import code12.service.impl.Circle;

import java.util.HashMap;

/**
 * @className: ShapeFactory
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
