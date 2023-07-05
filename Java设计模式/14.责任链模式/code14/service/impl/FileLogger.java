package code14.service.impl;

import code14.service.AbstractLogger;

/**
 * @className: FileLogger
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
