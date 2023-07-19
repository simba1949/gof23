package top.simba1949.proxy.jdk;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/19 22:40
 */
@Slf4j
public class RealSubject implements Subject {

    @Override
    public String doSomething() {
        log.info("RealSubject doSomething");
        return null;
    }
}