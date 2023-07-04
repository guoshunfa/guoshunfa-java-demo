package code31;

/**
 * @className: Client
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
