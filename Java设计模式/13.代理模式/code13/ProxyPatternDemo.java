package code13;

import code13.service.Image;
import code13.service.impl.ProxyImage;

/**
 * @className: ProxyPatternDemo
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
