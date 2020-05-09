package top.simba1949.singleton.pattern;

/**
 * 懒汉式——同步方法
 * 基本步骤：
 * 1. 构造器私有化
 * 2. 在类的内部创建对象
 * 3. 向外暴露一个静态的公共方法
 *
 *  优缺点：
 *   优点：起到懒加载的效果，线程也安全，但是使用同步方法，效率低下
 *   缺点：使用同步方法效率低下
 *
 * 结论：可以使用，但不推荐
 * @Author Theodore
 * @Date 2020/5/7 15:19
 */
public class SingletonApp4 {
    public static void main(String[] args) {
        // 连续获取对象，如果相等说明是同一个对象
        for (int i = 0; i < 1000; i++){
            new Runnable() {
                public void run() {
                    SingletonFour instance = SingletonFour.getInstance();
                    System.out.println(instance.hashCode());
                }
            }.run();
        }
    }
}

class SingletonFour{
    /**
     * 1. 构造器私有化
     */
    private SingletonFour() {
    }

    private static SingletonFour instance;
    /**
     * 2. 在类的内部创建对象，使用 synchronized 进行加锁保证线程安全
     * 3. 向外暴露一个静态的公共方法
     * @return
     */
    public synchronized static SingletonFour getInstance(){
        if (null == instance){
            instance = new SingletonFour();
        }
        return instance;
    }
}