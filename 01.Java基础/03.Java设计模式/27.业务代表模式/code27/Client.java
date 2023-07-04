package code27;

/**
 * @className: Client
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}
