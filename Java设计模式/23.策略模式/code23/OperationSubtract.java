package code23;

/**
 * @className: OperationSubtract
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class OperationSubtract implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
