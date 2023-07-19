package top.simba1949.proxy.javassist;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/19 23:28
 */
@Slf4j
public class JavassistSubjectService {

    public String doSomething(){
        log.info("JavassistSubjectService doSomething");
        return "SUCCESS";
    }
}