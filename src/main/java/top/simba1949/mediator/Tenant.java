package top.simba1949.mediator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/23 22:32
 */
@Slf4j
public class Tenant extends Person {

    public Tenant(String name, AbsMediator absMediator) {
        super(name, absMediator);
    }

    /**
     * 租客和中介沟通
     *
     * @param message
     */
    @Override
    public void contact(String message) {
        log.info("Tenant contact message is {}", message);
        super.getAbsMediator().contact(message, this);
    }

    @Override
    public void getMessage(String message) {
        log.info("Tenant getMessage is {}", message);
    }
}