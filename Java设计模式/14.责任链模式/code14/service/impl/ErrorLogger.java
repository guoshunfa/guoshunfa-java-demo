package code14.service.impl;

import code14.service.AbstractLogger;

/**
 * @className: ErrorLogger
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
