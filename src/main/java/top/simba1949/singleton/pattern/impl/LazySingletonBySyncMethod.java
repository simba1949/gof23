package top.simba1949.singleton.pattern.impl;

/**
 * 懒汉式——同步方法
 * 基本步骤：
 * 1. 构造器私有化
 * 2. 在类的内部创建对象
 * 3. 向外暴露一个静态的公共方法
 * <p>
 * 优缺点：
 * 优点：起到懒加载的效果，线程也安全，但是使用同步方法，效率低下
 * 缺点：使用同步方法效率低下
 * <p>
 * 结论：可以使用，但不推荐
 *
 * @author anthony
 * @datetime 2020/5/7 15:19
 */
public class LazySingletonBySyncMethod {
    /**
     * 1. 构造器私有化
     */
    private LazySingletonBySyncMethod() {
    }

    private static LazySingletonBySyncMethod instance;

    /**
     * 2. 在类的内部创建对象，使用 synchronized 进行加锁保证线程安全
     * 3. 向外暴露一个静态的公共方法
     *
     * @return
     */
    public synchronized static LazySingletonBySyncMethod getInstance() {
        if (null == instance) {
            instance = new LazySingletonBySyncMethod();
        }
        return instance;
    }
}