package code16.service.impl;

import code16.service.Expression;

/**
 * @className: AndExpression
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class AndExpression implements Expression {

    private Expression expr1 = null;
    private Expression expr2 = null;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
