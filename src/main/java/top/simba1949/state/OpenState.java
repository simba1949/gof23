package top.simba1949.state;

import lombok.extern.slf4j.Slf4j;

/**
 * 电梯门开启
 * 1.可以开门（do nothing）
 * 2.可以关闭
 * 3.可以停止
 * 4.不能运行
 * @author anthony
 * @datetime 2023/7/23 20:33
 */

@Slf4j
public class OpenState extends State {

    @Override
    public void openElevatorDoor() {
        log.info("当前电梯门开启");
    }

    @Override
    public void closeElevatorDoor() {
        super.context.setState(Context.CLOSE_STATE);
        super.context.closeElevatorDoor();
    }

    @Override
    public void stop() {
        super.context.setState(Context.STOP_STATE);
        super.context.stop();
    }

    @Override
    public void run() {

    }
}