package top.simba1949.observer;

/**
 * 观察者模式
 * @Author Theodore
 * @Date 2020/5/14 16:44
 */
public class ObserverModeApp {
    public static void main(String[] args) {
        /**
         * 具体目标发生改变...
         * 具体观察者1做出反应。。。
         * 具体观察者2做出反应。。。
         * 具体目标发生改变...
         * 具体观察者2做出反应。。。
         */
        ConcreteSubject concreteSubject = new ConcreteSubject();

        ConcreteObserverOne concreteObserverOne = new ConcreteObserverOne();
        ConcreteObserverTwo concreteObserverTwo = new ConcreteObserverTwo();

        concreteSubject.add(concreteObserverOne);
        concreteSubject.add(concreteObserverTwo);
        concreteSubject.notifyObserver();

        concreteSubject.remove(concreteObserverOne);
        concreteSubject.notifyObserver();
    }
}
