package top.simba1949.decorator;

/**
 * 23种设计模式之装饰者模式
 *
 * @author anthony
 * @datetime 2020/5/15 15:55
 */
public class DecoratorApplication {

    public static void main(String[] args) {
        // 创建一个被装饰的对象
        ConcreteComponent concreteComponent = new ConcreteComponent();
        // 构建一个具体的装饰者
        ConcreteDecorator concreteDecorator = new ConcreteDecorator(concreteComponent);
        // 通过装饰者来装饰
        concreteDecorator.operating();
    }
}