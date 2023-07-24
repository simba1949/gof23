package top.simba1949.visitor.dispatch.dynamicDispatch;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/24 21:31
 */
@Slf4j
public class DynamicDispatchDogAnimal extends DynamicDispatchAnimal {

    @Override
    public void execute() {
        log.info("DispatchDogAnimal");
    }
}