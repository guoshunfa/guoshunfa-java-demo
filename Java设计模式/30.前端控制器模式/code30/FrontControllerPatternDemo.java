package code30;

/**
 * @className: FrontControllerPatternDemo
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
