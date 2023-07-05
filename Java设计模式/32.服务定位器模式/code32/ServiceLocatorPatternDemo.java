package code32;

/**
 * @className: ServiceLocatorPatternDemo
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class ServiceLocatorPatternDemo {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
