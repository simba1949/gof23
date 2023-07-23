package top.simba1949.state;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/23 20:32
 */

@Slf4j
public class Context {
    // 定义对应状态对象的常量
    public static final CloseState CLOSE_STATE = new CloseState();
    public static final OpenState OPEN_STATE = new OpenState();
    public static final RunState RUN_STATE = new RunState();
    public static final StopState STOP_STATE = new StopState();

    private State state;

    public State getState() {
        return state;
    }

    /**
     * 设置当前状态
     *
     * @param state
     */
    public void setState(State state) {
        this.state = state;
        // 设置当前状态对象中的 Context
        this.state.setContext(this);
    }

    public void openElevatorDoor() {
        this.state.openElevatorDoor();
    }

    public void closeElevatorDoor() {
        this.state.closeElevatorDoor();
    }

    public void stop() {
        this.state.stop();
    }

    public void run() {
        this.state.run();
    }
}