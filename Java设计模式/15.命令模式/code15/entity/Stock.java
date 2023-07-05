package code15.entity;

/**
 * @className: Stock
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+", uantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }
}
