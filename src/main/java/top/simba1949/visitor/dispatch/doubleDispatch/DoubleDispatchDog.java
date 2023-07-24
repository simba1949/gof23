package top.simba1949.visitor.dispatch.doubleDispatch;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/24 21:54
 */
@Slf4j
public class DoubleDispatchDog extends DoubleDispatchAnimal {

    @Override
    public void accept(DoubleDispatchExecute execute) {
        execute.execute(this);
    }
}