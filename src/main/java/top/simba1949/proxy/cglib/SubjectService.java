package top.simba1949.proxy.cglib;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/19 22:54
 */
@Slf4j
public class SubjectService {

    public String doSomething(){
        log.info("SubjectService doSomething");
        return "SUCCESS";
    }
}