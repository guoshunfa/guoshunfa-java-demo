package code4.service.impl;

import code4.service.Packing;

/**
 * @className: Bottle
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
