package top.simba1949.observer.jdk;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Observable;

/**
 * @author anthony
 * @datetime 2023/7/23 21:45
 */
@Slf4j
@Data
public class JdkSubject extends Observable {

    public void sendMsg(String message) {
        log.info("发送的消息是：{}", message);
        super.setChanged();
        super.notifyObservers(message);
    }
}