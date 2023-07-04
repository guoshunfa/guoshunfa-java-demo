package code20;

/**
 * @className: Observer
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
