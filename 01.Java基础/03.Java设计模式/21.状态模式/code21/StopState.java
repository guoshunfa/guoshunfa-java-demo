package code21;

/**
 * @className: StopState
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
