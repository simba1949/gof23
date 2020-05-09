package top.simba1949.singleton.pattern;

/**
 * 饿汉式——静态代码块
 * 基本步骤：
 * 1. 构造器私有化
 * 2. 在类的内部创建对象
 * 3. 向外暴露一个静态的公共方法
 *
 * 优缺点
 *  优点：写法简单，在类装载的时候完成实例化，避免多线程问题
 *  缺点：没有进行懒加载，如果没有使用到会造成内存浪费
 *
 * 结论： 可以使用，但不推荐
 * @Author Theodore
 * @Date 2020/5/7 11:23
 */
public class SingletonApp2 {
    public static void main(String[] args) {
        // 连续获取对象，如果相等说明是同一个对象
        for (int i = 0; i < 1000; i++){
            new Runnable() {
                public void run() {
                    SingletonTwo instance = SingletonTwo.getInstance();
                    System.out.println(instance.hashCode());
                }
            }.run();
        }
    }
}

class SingletonTwo{

    /**
     * 1. 构造器私有化
     */
    private SingletonTwo() {
    }

    /**
     * 2. 在类的内部创建对象
     */
    private static SingletonTwo instance;

    static {
        // 静态代码块中，初始化
        instance = new SingletonTwo();
    }

    /**
     * 3. 向外暴露一个静态的公共方法
     * @return
     */
    public static SingletonTwo getInstance(){
        return instance;
    }
}