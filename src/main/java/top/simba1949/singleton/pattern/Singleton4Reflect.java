package top.simba1949.singleton.pattern;

/**
 *
 * 避免反射创建多个对象，在构造方法中判断如果实例属性不为 null 时，抛出异常即可
 *
 * @Author Theodore
 * @Date 2020/5/9 10:51
 */
public class Singleton4Reflect {

    private static Singleton4Reflect instance = new Singleton4Reflect();

    private Singleton4Reflect() {
        if (null != instance){
            throw new RuntimeException();
        }
    }

    public static Singleton4Reflect getInstance(){
        return instance;
    }
}