package code31;

/**
 * @className: AuthenticationFilter
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class AuthenticationFilter implements Filter {
    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }
}
