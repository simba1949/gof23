package top.simba1949.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2020/5/14 16:49
 */
@Slf4j
public class ConcreteObserverOne implements Observer {

    @Override
    public void receive(String message) {
        log.info("ConcreteObserverOne 接收到的消息是：{}", message);
    }
}