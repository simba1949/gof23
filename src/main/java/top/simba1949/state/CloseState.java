package top.simba1949.state;

import lombok.extern.slf4j.Slf4j;

/**
 * 电梯门关闭
 * 1.可以开门
 * 2.可以关门（do nothing）
 * 3.可以停止
 * 4，可以运行
 * @author anthony
 * @datetime 2023/7/23 20:33
 */

@Slf4j
public class CloseState extends State {

    @Override
    public void openElevatorDoor() {
        super.context.setState(Context.OPEN_STATE);
        super.context.openElevatorDoor();;
    }

    @Override
    public void closeElevatorDoor() {
        log.info("电梯门关闭");
    }

    @Override
    public void stop() {
        super.context.setState(Context.STOP_STATE);
        super.context.stop();;
    }

    @Override
    public void run() {
        super.context.setState(Context.RUN_STATE);
        super.context.run();;
    }
}