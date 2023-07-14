package top.simba1949.strategy;

/**
 * 定义了一个公共接口，各种不同的算法以不同的方式实现这个接口，环境角色使用这个接口调用不同的算法，一般使用接口或抽象类实现。
 * @author anthony
 * @datetime 2020/5/11 20:46
 */
public interface IStrategyMode {
    /**
     * 打印
     */
    void print();
}
