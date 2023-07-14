package top.simba1949.singleton.pattern.impl;

/**
 * 懒汉式——同步代码块，线程不安全，禁用
 * 基本步骤：
 * 1. 构造器私有化
 * 2. 在类的内部创建对象
 * 3. 向外暴露一个静态的公共方法
 * <p>
 * 优缺点：
 * 优点：起到懒加载的效果，比同步方法效率高一些，但是线程不安全
 * 缺点：比同步方法效率高一些，但是这种同步并不能起到线程安全问题
 * <p>
 * 结论：禁用
 *
 * @author anthony
 * @datetime 2020/5/7 15:22
 */
public class LazySingletonBySyncCode {
    /**
     * 1. 构造器私有化
     */
    private LazySingletonBySyncCode() {
    }

    private static LazySingletonBySyncCode instance;

    /**
     * 2. 在类的内部创建对象
     * 3. 向外暴露一个静态的公共方法
     *
     * @return
     */
    public static LazySingletonBySyncCode getInstance() {
        if (null == instance) {
            synchronized (LazySingletonBySyncCode.class) {
                // 只要有多个线程进入到 if 语句块中，每个线程会依次执行new对象操作（线程不安全）
                instance = new LazySingletonBySyncCode();
            }
        }
        return instance;
    }
}