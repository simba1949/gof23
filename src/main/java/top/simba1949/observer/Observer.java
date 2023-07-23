package top.simba1949.observer;

/**
 * @author anthony
 * @datetime 2020/5/14 16:46
 */
public interface Observer {

    /**
     * 接受消息
     */
    void receive(String message);
}