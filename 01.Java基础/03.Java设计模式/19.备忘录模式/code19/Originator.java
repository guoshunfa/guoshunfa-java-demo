package code19;

/**
 * @className: Originator
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class Originator {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}