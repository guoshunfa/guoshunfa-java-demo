package code3;

/**
 * @className: LazySingleton
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description: 懒汉式，线程不安全
 **/
public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton (){}

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
