package code3;

/**
 * @className: EagerSingleton
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
