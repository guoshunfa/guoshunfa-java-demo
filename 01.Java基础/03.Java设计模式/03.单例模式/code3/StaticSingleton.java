package code3;

/**
 * @className: StaticSingleton
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description: 登记式/静态内部类
 **/
public class StaticSingleton {
    private static class SingletonHolder {
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }
    private StaticSingleton (){}
    public static final StaticSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
