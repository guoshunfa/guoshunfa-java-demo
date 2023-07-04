package code7.service.impl;

import code7.service.DrawAPI;
import code7.service.Shape;

/**
 * @className: Circle
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
