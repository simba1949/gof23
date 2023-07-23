package top.simba1949.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author anthony
 * @datetime 2020/5/14 16:48
 */
public class ConcreteSubject implements Subject {

    protected List<Observer> observers = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void del(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {
        for (Observer observer : observers) {
            observer.receive(message);
        }
    }
}