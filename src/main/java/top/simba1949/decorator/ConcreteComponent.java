package top.simba1949.decorator;

/**
 * @author anthony
 * @datetime 2020/5/16 16:17
 */
public class ConcreteComponent implements Component{
    /**
     * 实际需要装饰的方法
     */
    @Override
    public void operating() {
        System.out.println("------我是可爱的分割线-------");
    }
}
