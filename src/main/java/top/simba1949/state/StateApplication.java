package top.simba1949.state;

/**
 * @author anthony
 * @datetime 2023/7/23 16:35
 */
public class StateApplication {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new CloseState());

        context.closeElevatorDoor();
        context.openElevatorDoor();

        context.run();
        context.stop();
    }
}