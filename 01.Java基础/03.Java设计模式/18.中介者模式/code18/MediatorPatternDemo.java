package code18;

import code18.entity.User;

/**
 * @className: MediatorPatternDemo
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
