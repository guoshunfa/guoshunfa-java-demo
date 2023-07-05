package code4.service.impl;

import code4.service.ColdDrink;

/**
 * @className: Pepsi
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
