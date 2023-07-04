package code21;

/**
 * @className: StatePatternDemo
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
