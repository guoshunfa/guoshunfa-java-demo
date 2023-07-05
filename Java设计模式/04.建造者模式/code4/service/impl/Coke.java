package code4.service.impl;

import code4.service.ColdDrink;

/**
 * @className: Coke
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
