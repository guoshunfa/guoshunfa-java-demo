package code7.service;

import code7.service.DrawAPI;

/**
 * @className: Shape
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
