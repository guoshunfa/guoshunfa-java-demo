package code21;

/**
 * @className: Context
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
