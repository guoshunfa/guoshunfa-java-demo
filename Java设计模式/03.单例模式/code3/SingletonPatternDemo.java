package code3;

/**
 * @className: SingletonPatternDemo
 * @author: GuoShunFa
 * @date: 2022/12/7
 **/
public class SingletonPatternDemo {
    public static void main(String[] args) throws NoSuchFieldException {

        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        // 最简单的单例模式
        SingleObject singleObject = SingleObject.getInstance();
        // 饿汉式，线程不安全
        LazySingleton lazySingleton = LazySingleton.getInstance();
        // 懒汉式，线程安全
        LazySingletonAddLock lazySingletonAddLock = LazySingletonAddLock.getInstance();
        // 饿汉式
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        // 双检锁/双重校验锁（DCL，即 double-checked locking）
        SingletonDoubleCheckedLocking singletonDoubleCheckedLocking = SingletonDoubleCheckedLocking.getSingleton();
        // 登记式/静态内部类
        StaticSingleton staticSingleton = StaticSingleton.getInstance();
        // 枚举
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;

    }
}
