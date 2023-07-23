package top.simba1949.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2020/5/14 16:50
 */
@Slf4j
public class ConcreteObserverTwo implements Observer {

    @Override
    public void receive(String message) {
        log.info("ConcreteObserverTwo 接收到的消息是：{}", message);
    }
}