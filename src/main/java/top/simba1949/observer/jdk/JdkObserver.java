package top.simba1949.observer.jdk;

import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;

/**
 * @author anthony
 * @datetime 2023/7/23 21:50
 */
@Slf4j
public class JdkObserver implements Observer {

    /**
     * 这里的 Object arg 就是主题发送的消息
     * @param o     the observable object.
     * @param arg   an argument passed to the <code>notifyObservers</code>
     *                 method.
     */
    @Override
    public void update(Observable o, Object arg) {
        log.info("Observable is {}, Object is {}", o, arg);
    }
}