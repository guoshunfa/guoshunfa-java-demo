package code2.factory;

import code2.service.Color;
import code2.service.Shape;
import code2.service.impl.Blue;
import code2.service.impl.Green;
import code2.service.impl.Red;

/**
 * @className: ColorFactory
 * @author: GuoShunFa
 * @date: 2022/12/7
 **/
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}
