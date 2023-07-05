package code11;

import code11.maker.ShapeMaker;

/**
 * @className: FacadePatternDemo
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
