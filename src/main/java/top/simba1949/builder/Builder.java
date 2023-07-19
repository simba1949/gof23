package top.simba1949.builder;

/**
 * @author anthony
 * @datetime 2023/7/19 21:09
 */
public abstract class Builder {
    // 这里使用 new 进行初始化，
    // Car 如果没有重写 equals 和 hashCode 方法，则每次获取 Builder 子类时会是新对象
    public Car car = new Car();

    /**
     * 构建车架
     */
    abstract void buildFrame();

    /**
     * 构建座椅
     */
    abstract void buildSeat();

    /**
     * 生产车辆
     * @return
     */
    abstract Car getResult();
}