package top.simba1949.singleton.pattern.impl;

/**
 * 懒汉式——双重检查（同步代码块）
 * 基本步骤：
 * 1. 构造器私有化
 * 2. 在类的内部创建对象
 * 3. 向外暴露一个静态的公共方法
 * <p>
 * 优缺点：
 * 优点：起到懒加载的效果，线程也安全，比同步方法效率高一些
 * 比同步方法效率高一些，双重检查保证线程安全，（由于 JVM 底层内部模型原因，偶尔会出现问题，需要使用 volatile 防止指令重排）
 * <p>
 * 结论：推荐使用
 *
 * @author anthony
 * @datetime 2020/5/9 9:59
 */
public class SingletonByDoubleCheckSync {
    /**
     * 1. 构造器私有化
     */
    private SingletonByDoubleCheckSync() {
    }

    /**
     * 2. 在类的内部创建对象
     * 3. 向外暴露一个静态的公共方法
     *
     * @return
     */
    private volatile static SingletonByDoubleCheckSync instance;

    public static SingletonByDoubleCheckSync getInstance() {
        if (null == instance) {
            synchronized (SingletonByDoubleCheckSync.class) {
                if (null == instance) {
                    instance = new SingletonByDoubleCheckSync();
                }
            }
        }
        return instance;
    }
}