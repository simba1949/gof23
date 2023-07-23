package top.simba1949.observer;

import top.simba1949.observer.jdk.JdkObserver;
import top.simba1949.observer.jdk.JdkSubject;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者模式
 *
 * @author anthony
 * @datetime 2020/5/14 16:44
 */
public class ObserverApplication {

    public static void main(String[] args) {
        jdkObserver();
    }

    public static void jdkObserver(){
        JdkSubject jdkSubject = new JdkSubject();

        Observer observer = new JdkObserver();
        jdkSubject.addObserver(observer);

        jdkSubject.sendMsg("好消息");
    }

    public static void customObserver(){
        // 创建主题
        Subject subject = new ConcreteSubject();

        // 创建订阅者（观察者）
        ConcreteObserverOne concreteObserverOne = new ConcreteObserverOne();
        ConcreteObserverTwo concreteObserverTwo = new ConcreteObserverTwo();

        // 主体添加订阅者（观察者）
        subject.add(concreteObserverOne);
        subject.add(concreteObserverTwo);

        // 主体通知订阅者（观察者）
        subject.notifyObserver("订阅号启动");
    }
}