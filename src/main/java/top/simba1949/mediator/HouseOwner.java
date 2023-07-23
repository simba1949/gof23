package top.simba1949.mediator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/23 22:32
 */
@Slf4j
public class HouseOwner extends Person {

    public HouseOwner(String name, AbsMediator absMediator) {
        super(name, absMediator);
    }

    /**
     * 房东和中介沟通
     *
     * @param message
     */
    @Override
    public void contact(String message) {
        log.info("HouseOwner contact message is {}", message);
        super.getAbsMediator().contact(message, this);
    }

    @Override
    public void getMessage(String message) {
        log.info("HouseOwner getMessage is {}", message);
    }
}