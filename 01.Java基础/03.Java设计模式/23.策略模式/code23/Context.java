package code23;

/**
 * @className: Context
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
