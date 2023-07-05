package code15.service.impl;

import code15.entity.Stock;
import code15.service.Order;

/**
 * @className: SellStock
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
