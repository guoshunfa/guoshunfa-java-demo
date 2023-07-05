package code27;

/**
 * @className: EJBService
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class EJBService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
