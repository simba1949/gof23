package top.simba1949.observer;

/**
 * @Author Theodore
 * @Date 2020/5/14 16:48
 */
public class ConcreteSubject extends Subject{
    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变...");

        for(Object obs : observers){
            ((Observer)obs).response();
        }
    }
}
