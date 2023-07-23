package top.simba1949.observer;

/**
 * @author anthony
 * @datetime 2020/5/14 16:45
 */
public interface Subject {

    /**
     * 增加观察者方法
     *
     * @param observer
     */
    void add(Observer observer);

    /**
     * 删除观察者方法
     *
     * @param observer
     */
    void del(Observer observer);

    /**
     * 通知观察者方法
     */
    void notifyObserver(String message);
}