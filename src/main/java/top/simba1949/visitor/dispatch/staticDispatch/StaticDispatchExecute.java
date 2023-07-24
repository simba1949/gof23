package top.simba1949.visitor.dispatch.staticDispatch;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/24 21:31
 */
@Slf4j
public class StaticDispatchExecute {

    public void execute(Object src) {
        log.info("execute Object");
    }

    public void execute(String src) {
        log.info("execute String");
    }

    public void execute(Integer src) {
        log.info("execute Integer");
    }
}