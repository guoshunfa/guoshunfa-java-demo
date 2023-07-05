package code4.service.impl;

import code4.service.Burger;

/**
 * @className: ChickenBurger
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
