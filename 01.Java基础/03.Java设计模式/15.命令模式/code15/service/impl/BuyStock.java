package code15.service.impl;

import code15.entity.Stock;
import code15.service.Order;

/**
 * @className: BuyStock
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
