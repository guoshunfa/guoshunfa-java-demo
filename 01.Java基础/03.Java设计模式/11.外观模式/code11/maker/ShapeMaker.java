package code11.maker;

import code11.service.Shape;
import code11.service.impl.Circle;
import code11.service.impl.Rectangle;
import code11.service.impl.Square;

/**
 * @className: ShapeMaker
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
