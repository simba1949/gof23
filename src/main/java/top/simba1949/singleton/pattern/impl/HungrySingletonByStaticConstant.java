package top.simba1949.singleton.pattern.impl;

/**
 * 饿汉式——静态常量
 * 基本步骤：
 * 1. 构造器私有化
 * 2. 在类的内部创建对象
 * 3. 向外暴露一个静态的公共方法
 * <p>
 * 优缺点
 * 优点：写法简单，在类装载的时候完成实例化，避免多线程问题
 * 缺点：没有进行懒加载，如果没有使用到会造成内存浪费
 * <p>
 * 结论： 可以使用，但不推荐
 *
 * @author anthony
 * @datetime 2020/5/7 11:23
 */
public class HungrySingletonByStaticConstant {

    /**
     * 1. 构造器私有化
     */
    private HungrySingletonByStaticConstant() {
    }

    /**
     * 2. 在类的内部创建对象
     */
    private final static HungrySingletonByStaticConstant instance = new HungrySingletonByStaticConstant();

    /**
     * 3. 向外暴露一个静态的公共方法
     *
     * @return
     */
    public static HungrySingletonByStaticConstant getInstance() {
        return instance;
    }
}