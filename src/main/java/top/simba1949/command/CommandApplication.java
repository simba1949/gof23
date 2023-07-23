package top.simba1949.command;

/**
 * @author anthony
 * @datetime 2020/5/18 10:26
 */
public class CommandApplication {

    public static void main(String[] args) {
        // 接受者
        Receiver receiver = new Receiver();
        // 让命令持有一个接受者
        Command command = new ConcreteCommand(receiver);
        // 调用者
        Invoker invoker = new Invoker(command);
        // 调用者进行调用，调用者和接受者分离
        invoker.call();
    }
}