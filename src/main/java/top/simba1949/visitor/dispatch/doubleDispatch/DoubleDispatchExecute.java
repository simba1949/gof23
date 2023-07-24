package top.simba1949.visitor.dispatch.doubleDispatch;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/24 21:54
 */
@Slf4j
public class DoubleDispatchExecute {

    public void execute(DoubleDispatchAnimal animal) {
        log.info("DoubleDispatchAnimal");
    }

    public void execute(DoubleDispatchCat cat) {
        log.info("DoubleDispatchCat");
    }

    public void execute(DoubleDispatchDog dog) {
        log.info("DoubleDispatchDog");
    }
}