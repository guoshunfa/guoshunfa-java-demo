package code31;

/**
 * @className: InterceptingFilterDemo
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class InterceptingFilterDemo {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
