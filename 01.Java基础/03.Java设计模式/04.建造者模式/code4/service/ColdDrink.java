package code4.service;

import code4.service.impl.Bottle;

/**
 * @className: ColdDrink
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
