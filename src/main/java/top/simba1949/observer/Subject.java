package top.simba1949.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Theodore
 * @Date 2020/5/14 16:45
 */
public abstract class Subject {

    protected List<Observer> observers = new ArrayList<>();

    /**
     * 增加观察者方法
     * @param observer
     */
    public void add(Observer observer){
        observers.add(observer);
    }

    /**
     * 删除观察者方法
     * @param observer
     */
    public void remove(Observer observer){
        observers.remove(observer);
    }

    /**
     * 通知观察者方法
     */
    public abstract void notifyObserver();
}
