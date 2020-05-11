package top.simba1949.factory.simple;

/**
 * @Author Theodore
 * @Date 2020/5/9 11:52
 */
public class GreekPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("希腊风味Pizza原材料准备中。。。");
    }
}