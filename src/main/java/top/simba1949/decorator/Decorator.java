package top.simba1949.decorator;

/**
 * @author anthony
 * @datetime 2020/5/16 16:18
 */
public abstract class Decorator implements Component {

    /**
     * 以组合的方式进行装饰
     */
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operating() {
        component.operating();
    }
}