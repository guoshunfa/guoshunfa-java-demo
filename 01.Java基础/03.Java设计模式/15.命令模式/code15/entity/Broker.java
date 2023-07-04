package code15.entity;

import code15.service.Order;

import java.util.ArrayList;
import java.util.List;
/**
 * @className: Broker
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
