package code19;

/**
 * @className: Memento
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
