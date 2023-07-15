package top.simba1949.singleton.pattern;

/**
 * 避免反射创建多个对象，在构造方法中判断如果实例属性不为 null 时，抛出异常即可
 *
 * @author anthony
 * @datetime 2020/5/9 10:51
 */
public class SingletonByReflect {

    private static final SingletonByReflect instance = new SingletonByReflect();

    private SingletonByReflect() {
        if (null != instance) {
            throw new RuntimeException();
        }
    }

    public static SingletonByReflect getInstance() {
        return instance;
    }
}