package code7;

import code7.service.Shape;
import code7.service.impl.Circle;
import code7.service.impl.GreenCircle;
import code7.service.impl.RedCircle;

/**
 * @className: BridgePatternDemo
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
