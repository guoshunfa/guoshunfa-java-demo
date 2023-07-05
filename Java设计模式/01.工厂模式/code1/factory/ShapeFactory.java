package code1.factory;

import code1.service.impl.Circle;
import code1.service.impl.Rectangle;
import code1.service.Shape;
import code1.service.impl.Square;

/**
 * @className: ShapeFactory
 * @author: GuoShunFa
 * @date: 2022/12/7
 **/
public class ShapeFactory {

    //使用 getShape 方法获取形状类型的对象
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
}