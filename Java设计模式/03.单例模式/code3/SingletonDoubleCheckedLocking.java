package code3;

/**
 * @className: SingletonDoubleCheckedLocking
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description: 双检锁/双重校验锁（DCL，即 double-checked locking）
 **/
public class SingletonDoubleCheckedLocking {
    private volatile static SingletonDoubleCheckedLocking singleton;
    private SingletonDoubleCheckedLocking(){}
    public static SingletonDoubleCheckedLocking getSingleton() {
        if (singleton == null) {
            synchronized (SingletonDoubleCheckedLocking.class) {
                if (singleton == null) {
                    singleton = new SingletonDoubleCheckedLocking();
                }
            }
        }
        return singleton;
    }
}
