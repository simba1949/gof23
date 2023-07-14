package top.simba1949.singleton.pattern.impl;

/**
 * 懒汉式——静态内部类
 * 基本步骤：
 * 1. 构造器私有化
 * 2. 在类的内部创建对象
 * 3. 向外暴露一个静态的公共方法
 * <p>
 * 优缺点：
 * 优点：起到懒加载的效果，线程也安全（采用类装载机制保证初始化实例时只有一个线程），效率高
 * 静态内部类方式在SingletonSeven类被装载是不会立即实例化，调用 getInstance() 方法才会装载，从而完成单例实例化
 * 类的静态属性只会在第一次加载类时初始化，JVM底层保证了线程安全，在类进行初始化时，其他线程无法进入
 * <p>
 * 结论：推荐使用
 *
 * @author anthony
 * @datetime 2020/5/9 10:11
 */
public class SingletonByStaticInnerClass {
    /**
     * 1. 构造器私有化
     */
    private SingletonByStaticInnerClass() {
    }

    private static class Inner {
        /**
         * 写一个静态内部类，该类中有一个静态属性 SingletonByStaticInnerClass
         * 2. 在类的内部创建对象
         */
        private static final SingletonByStaticInnerClass INSTANCE = new SingletonByStaticInnerClass();
    }

    /**
     * 3. 向外暴露一个静态的公共方法
     *
     * @return
     */
    public static SingletonByStaticInnerClass getInstance() {
        return Inner.INSTANCE;
    }
}