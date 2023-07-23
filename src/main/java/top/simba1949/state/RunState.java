package top.simba1949.state;

import lombok.extern.slf4j.Slf4j;

/**
 * 电梯运行
 * 1.不可以开门
 * 2.可以关门（do nothing）
 * 3.可以停止
 * 4.可以运行
 * @author anthony
 * @datetime 2023/7/23 20:33
 */

@Slf4j
public class RunState extends State {

    @Override
    public void openElevatorDoor() {

    }

    @Override
    public void closeElevatorDoor() {

    }

    @Override
    public void stop() {
        super.context.setState(Context.STOP_STATE);
        super.context.stop();
    }

    @Override
    public void run() {
        log.info("电梯正在运行中");
    }
}