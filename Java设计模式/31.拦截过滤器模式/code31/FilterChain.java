package code31;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: FilterChain
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();
    private Target target;

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void execute(String request){
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target){
        this.target = target;
    }
}
