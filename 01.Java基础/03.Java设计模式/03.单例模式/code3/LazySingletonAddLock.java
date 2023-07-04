package code3;

/**
 * @className: LazySingletonAddLock
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description: 懒汉式，线程安全
 **/
public class LazySingletonAddLock {
    private static LazySingletonAddLock instance;
    private LazySingletonAddLock (){}
    public static synchronized LazySingletonAddLock getInstance() {
        if (instance == null) {
            instance = new LazySingletonAddLock();
        }
        return instance;
    }
}
