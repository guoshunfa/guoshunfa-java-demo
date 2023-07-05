package code31;

/**
 * @className: DebugFilter
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class DebugFilter implements Filter {
    public void execute(String request){
        System.out.println("request log: " + request);
    }
}
