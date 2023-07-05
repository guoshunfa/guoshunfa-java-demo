package code32;

/**
 * @className: Service2
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class Service2 implements Service {
    public void execute(){
        System.out.println("Executing Service2");
    }

    @Override
    public String getName() {
        return "Service2";
    }
}
