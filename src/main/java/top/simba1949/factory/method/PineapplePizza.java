package top.simba1949.factory.method;

/**
 * @author anthony
 * @datetime 2020/5/9 14:32
 */
public class PineapplePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("PineapplePizza 准备中。。。");
    }

    @Override
    public String toString() {
        return "PineapplePizza{" +
            "name='" + name + '\'' +
            '}';
    }
}