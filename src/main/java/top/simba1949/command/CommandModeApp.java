package top.simba1949.command;

/**
 * @author anthony
 * @datetime 2020/5/18 10:26
 */
public class CommandModeApp {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ConcreteCommand concreteCommand = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(concreteCommand);
        invoker.call();
    }
}
