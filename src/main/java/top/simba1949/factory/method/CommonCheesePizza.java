package top.simba1949.factory.method;

/**
 * @author anthony
 * @datetime 2020/5/9 13:59
 */
public class CommonCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("加盟店通用的 cheesePizza 准备中。。。");
    }

    @Override
    public String toString() {
        return "CommonCheesePizza{" +
            "name='" + name + '\'' +
            '}';
    }
}