package top.simba1949.singleton.pattern;

/**
 * 懒汉式——枚举
 *
 * 优缺点：
 *  优点：线程安全，调用效率高，不能延时加载，实现简单。由于 JVM 从根本上提供保障，避免通过反射和反序列化的漏洞
 *
 *  结论：推荐使用
 * @Author Theodore
 * @Date 2020/5/9 10:37
 */
public class SingletonApp8 {
    public static void main(String[] args) {
        // 连续获取对象，如果相等说明是同一个对象
        for (int i = 0; i < 1000; i++){
            new Runnable() {
                public void run() {
                    SingletonEight instance = SingletonEight.INSTANCE;
                    System.out.println(instance.hashCode());
                }
            }.run();
        }
    }
}

enum  SingletonEight{
    INSTANCE;
}