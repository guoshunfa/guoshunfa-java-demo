package code14.service.impl;

import code14.service.AbstractLogger;

/**
 * @className: ConsoleLogger
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
