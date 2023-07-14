package top.simba1949.factory.simple;

/**
 * @author anthony
 * @datetime 2020/5/9 11:51
 */
public class CheesePizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("芝士Pizza原材料准备中。。。");
    }
}