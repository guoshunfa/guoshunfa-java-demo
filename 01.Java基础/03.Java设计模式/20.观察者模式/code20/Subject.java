package code20;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: Subject
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class Subject {

    private List<Observer> observers
            = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

