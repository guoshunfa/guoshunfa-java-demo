package code19;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: CareTaker
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
