package code2.factory;

import code2.service.Color;
import code2.service.Shape;
import code2.service.impl.Circle;
import code2.service.impl.Rectangle;
import code2.service.impl.Square;

/**
 * @className: ShapeFactory
 * @author: GuoShunFa
 * @date: 2022/12/7
 **/
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
