package top.simba1949.factory.method;

/**
 * @Author Theodore
 * @Date 2020/5/9 14:31
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("CheesePizza 准备中。。。");
    }

    @Override
    public String toString() {
        return "CheesePizza{" +
            "name='" + name + '\'' +
            '}';
    }
}