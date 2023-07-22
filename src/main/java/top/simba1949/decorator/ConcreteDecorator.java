package top.simba1949.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2020/5/16 16:19
 */
@Slf4j
public class ConcreteDecorator extends Decorator {

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

    public void beforeOperating() {
        log.info("我在分割线上面");
    }

    public void afterOperating() {
        log.info("我在分割线下面");
    }
}