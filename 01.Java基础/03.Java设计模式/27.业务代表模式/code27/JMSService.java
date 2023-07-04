package code27;

/**
 * @className: JMSService
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
