package top.simba1949.state;

import lombok.extern.slf4j.Slf4j;

/**
 * 电梯停止
 *  1.可以开门
 *  2.可以关门
 *  3.可以运行
 *  4.可以停止（do nothing）
 * @author anthony
 * @datetime 2023/7/23 20:33
 */
@Slf4j
public class StopState extends State {

    @Override
    public void openElevatorDoor() {
        super.context.setState(Context.OPEN_STATE);
        super.context.openElevatorDoor();
    }

    @Override
    public void closeElevatorDoor() {
        super.context.setState(Context.CLOSE_STATE);
        super.context.closeElevatorDoor();
    }

    @Override
    public void stop() {
        log.info("电梯停止");
    }

    @Override
    public void run() {
        super.context.setState(Context.RUN_STATE);
        super.context.run();
    }
}