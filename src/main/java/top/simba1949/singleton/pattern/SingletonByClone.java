package top.simba1949.singleton.pattern;

/**
 * 防止克隆
 *
 * @author anthony
 * @datetime 2020/5/9 10:51
 */
public class SingletonByClone implements Cloneable {

    private static final SingletonByClone instance = new SingletonByClone();

    private SingletonByClone() {

    }

    public static SingletonByClone getInstance() {
        return instance;
    }


    /**
     * 防止克隆破坏
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 下面这一行代码，虽然重写了 clone 方法，但是实际上调用 Object 的 clone 方法，相当于没有重写
        // 用于验证 clone 确实破坏了单例
        // return super.clone();

        // 下面返回是防止 clone 破坏单例模式
        return instance;
    }
}