package code16.service.impl;

import code16.service.Expression;

/**
 * @className: TerminalExpression
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
