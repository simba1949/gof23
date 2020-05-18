package top.simba1949.command;

/**
 * @Author Theodore
 * @Date 2020/5/18 10:31
 */
public class Invoker {
    private Command command;

    public void call(){
        System.out.println("调用者调用命令模式。。。");
        command.execute();
    }

    public Invoker(Command command) {
        this.command = command;
    }
}
