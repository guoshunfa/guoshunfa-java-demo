package code31;

/**
 * @className: FilterManager
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }
}