package top.simba1949.command;

/**
 * @Author Theodore
 * @Date 2020/5/18 10:30
 */
public class ConcreteCommand implements Command{

    private Receiver receiver;
    @Override
    public void execute() {
        // 命令通知接受者
        receiver.action();
    }

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }
}
