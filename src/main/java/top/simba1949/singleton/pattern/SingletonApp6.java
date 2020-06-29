package top.simba1949.singleton.pattern;

/**
 * 懒汉式——双重检查（同步代码块）
 * 基本步骤：
 * 1. 构造器私有化
 * 2. 在类的内部创建对象
 * 3. 向外暴露一个静态的公共方法
 *
 * 优缺点：
 *  优点：起到懒加载的效果，线程也安全，比同步方法效率高一些
 *  比同步方法效率高一些，双重检查保证线程安全，（由于 JVM 底层内部模型原因，偶尔会出现问题，需要使用 volatile 防止指令重排）
 *
 *  结论：推荐使用
 * @Author Theodore
 * @Date 2020/5/9 9:59
 */
public class SingletonApp6 {
    public static void main(String[] args) {
        // 连续获取对象，如果相等说明是同一个对象
        for (int i = 0; i < 1000; i++){
            new Runnable() {
                public void run() {
                    SingletonSix instance = SingletonSix.getInstance();
                    System.out.println(instance.hashCode());
                }
            }.run();
        }
    }
}

class SingletonSix{
    /**
     * 1. 构造器私有化
     */
    private SingletonSix() {
    }

    /**
     * 2. 在类的内部创建对象
     * 3. 向外暴露一个静态的公共方法
     * @return
     */
    private volatile static SingletonSix instance;

    public static SingletonSix getInstance(){
        if (null == instance){
            synchronized (SingletonSix.class){
                if (null == instance){
                    instance = new SingletonSix();
                }
            }
        }
        return instance;
    }
}