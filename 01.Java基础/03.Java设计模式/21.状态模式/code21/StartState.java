package code21;

/**
 * @className: StartState
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
