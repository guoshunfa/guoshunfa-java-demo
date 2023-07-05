package code4.service.impl;

import code4.service.Burger;

/**
 * @className: VegBurger
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
