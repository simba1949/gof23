package top.simba1949.singleton.pattern;

/**
 * 懒汉式——线程不安全
 * 基本步骤：
 * 1. 构造器私有化
 * 2. 在类的内部创建对象
 * 3. 向外暴露一个静态的公共方法
 *
 * 优缺点：
 *  优点：起到懒加载的效果，但是只能用于单线程下使用
 *  缺点：多线程下，一个线程进入if (null == instance){}判断语句，还未创建对象，另一个线程也进入这个判断语句，此时会产生多个实例
 *
 * 结论：禁用
 * @Author Theodore
 * @Date 2020/5/7 11:43
 */
public class SingletonApp3 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++){
            new Runnable() {
                public void run() {
                    SingletonThree instance = SingletonThree.getInstance();
                    System.out.println(instance.hashCode());
                }
            }.run();
        }
    }
}

class SingletonThree{
    /**
     * 1. 构造器私有化
     */
    private SingletonThree() {
    }

    private static SingletonThree instance;

    /**
     * 2. 在类的内部创建对象
     * 3. 向外暴露一个静态的公共方法
     * @return
     */
    public static SingletonThree getInstance(){
        if (null == instance){
            instance = new SingletonThree();
        }
        return instance;
    }
}