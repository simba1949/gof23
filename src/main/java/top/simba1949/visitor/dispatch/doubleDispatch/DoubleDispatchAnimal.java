package top.simba1949.visitor.dispatch.doubleDispatch;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/24 21:53
 */
@Slf4j
public class DoubleDispatchAnimal {

    public void accept(DoubleDispatchExecute execute) {
        execute.execute(this);
    }
}