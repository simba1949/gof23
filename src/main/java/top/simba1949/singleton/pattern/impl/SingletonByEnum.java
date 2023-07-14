package top.simba1949.singleton.pattern.impl;

/**
 * 懒汉式——枚举
 * <p>
 * 优缺点：
 * 优点：线程安全，调用效率高，不能延时加载，实现简单。由于 JVM 从根本上提供保障，避免通过反射和反序列化的漏洞
 * <p>
 * 结论：推荐使用
 *
 * @author anthony
 * @datetime 2020/5/9 10:37
 */
public enum SingletonByEnum {
    INSTANCE;
}