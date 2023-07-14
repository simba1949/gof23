package top.simba1949.singleton.pattern.impl;

/**
 * 懒汉式——线程不安全
 * 基本步骤：
 * 1. 构造器私有化
 * 2. 在类的内部创建对象
 * 3. 向外暴露一个静态的公共方法
 * <p>
 * 优缺点：
 * 优点：起到懒加载的效果，但是只能用于单线程下使用
 * 缺点：多线程下，一个线程进入if (null == instance){}判断语句，还未创建对象，另一个线程也进入这个判断语句，此时会产生多个实例
 * <p>
 * 结论：禁用
 *
 * @author anthony
 * @datetime 2020/5/7 11:43
 */
public class LazySingletonByCommon {

    /**
     * 1. 构造器私有化
     */
    private LazySingletonByCommon() {
    }

    private static LazySingletonByCommon instance;

    /**
     * 2. 在类的内部创建对象
     * 3. 向外暴露一个静态的公共方法
     *
     * @return
     */
    public static LazySingletonByCommon getInstance() {
        if (null == instance) {
            instance = new LazySingletonByCommon();
        }
        return instance;
    }
}