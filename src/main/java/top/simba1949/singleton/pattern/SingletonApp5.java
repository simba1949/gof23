package top.simba1949.singleton.pattern;

/**
 * 懒汉式——同步代码块，线程不安全，禁用
 * 基本步骤：
 * 1. 构造器私有化
 * 2. 在类的内部创建对象
 * 3. 向外暴露一个静态的公共方法
 *
 * 优缺点：
 *  优点：起到懒加载的效果，比同步方法效率高一些，但是线程不安全
 *  缺点：比同步方法效率高一些，但是这种同步并不能起到线程安全问题
 *
 * 结论：禁用
 * @Author Theodore
 * @Date 2020/5/7 15:22
 */
public class SingletonApp5 {
    public static void main(String[] args) {
        // 连续获取对象，如果相等说明是同一个对象
        for (int i = 0; i < 1000; i++){
            new Runnable() {
                public void run() {
                    SingletonFive instance = SingletonFive.getInstance();
                    System.out.println(instance.hashCode());
                }
            }.run();
        }
    }
}
class SingletonFive{
    /**
     * 1. 构造器私有化
     */
    private SingletonFive() {
    }

    private static SingletonFive instance;
    /**
     * 2. 在类的内部创建对象
     * 3. 向外暴露一个静态的公共方法
     * @return
     */
    public static SingletonFive getInstance(){
        if (null == instance){
            synchronized (SingletonFive.class){
                // 只要有多个线程进入到 if 语句块中，每个线程会依次执行new对象操作（线程不安全）
                instance = new SingletonFive();
            }
        }
        return instance;
    }
}