package top.simba1949.decorator;

/**
 * @Author Theodore
 * @Date 2020/5/16 16:19
 */
public class ConcreteDecorator extends Decorator{

    public ConcreteDecorator(Component component) {
        super(component);
    }

    /**
     * 进行修饰
     */
    @Override
    public void operating() {
        beforeOperating();
        super.operating();
        afterOperating();
    }

    public void beforeOperating(){
        System.out.println("我在分割线上面");
    }

    public void afterOperating(){
        System.out.println("我在分割线下面");
    }
}
