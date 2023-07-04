package code32;

/**
 * @className: Service1
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class Service1 implements Service {
    public void execute(){
        System.out.println("Executing Service1");
    }

    @Override
    public String getName() {
        return "Service1";
    }
}
