package top.simba1949.observer;

/**
 * @Author Theodore
 * @Date 2020/5/14 16:49
 */
public class ConcreteObserverOne implements Observer{
    @Override
    public void response() {
        System.out.println("具体观察者1做出反应。。。");
    }
}
