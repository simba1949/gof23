package top.simba1949.command;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2020/5/18 10:31
 */
@Slf4j
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void call() {
        log.info("调用者调用命令模式。。。");
        command.execute();
    }
}