package top.simba1949.decorator;

/**
 * 23种设计模式之装饰者模式
 * @Author Theodore
 * @Date 2020/5/15 15:55
 */
public class DecoratorDesignPatternApp {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecorator concreteDecorator = new ConcreteDecorator(concreteComponent);
        concreteDecorator.operating();
    }
}
