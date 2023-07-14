package top.simba1949.observer;

/**
 * @author anthony
 * @datetime 2020/5/14 16:50
 */
public class ConcreteObserverTwo implements Observer{
    @Override
    public void response() {
        System.out.println("具体观察者2做出反应。。。");
    }
}
