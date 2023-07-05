package code4.service;

import code4.service.impl.Wrapper;

/**
 * @className: Burger
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
