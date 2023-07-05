package code2.factory;

import code2.service.Color;
import code2.service.Shape;

/**
 * @className: AbstractFactory
 * @author: GuoShunFa
 * @date: 2022/12/7
 **/
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
