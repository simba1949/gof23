package top.simba1949.singleton.pattern;

import java.io.Serializable;

/**
 * 添加 readResolve() 方法可以避免反序列化创建多个对象
 *
 * @Author Theodore
 * @Date 2020/5/9 10:53
 */
public class Singleton4Serializable implements Serializable {
    private static final long serialVersionUID = 5155396228091341764L;

    private static Singleton4Serializable instance = new Singleton4Serializable();

    private Singleton4Serializable() {
    }

    public static Singleton4Serializable getInstance(){
        return instance;
    }

    /**
     * 添加 readResolve() 方法可以避免反序列化创建多个对象
     * @return
     */
    private Object readResolve(){
        return instance;
    }
}