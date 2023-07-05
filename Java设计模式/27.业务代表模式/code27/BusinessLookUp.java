package code27;

/**
 * @className: BusinessLookUp
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}
