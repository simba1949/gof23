package top.simba1949.state;

/**
 * @author anthony
 * @datetime 2023/7/23 20:32
 */
public abstract class State {
    // 声明上下文
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * 打开电梯门
     */
    public abstract void openElevatorDoor();

    /**
     * 关闭电梯门
     */
    public abstract void closeElevatorDoor();

    /**
     * 停止电梯
     */
    public abstract void stop();

    /**
     * 运行电梯
     */
    public abstract void run();
}