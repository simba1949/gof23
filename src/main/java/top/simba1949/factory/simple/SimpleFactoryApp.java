package top.simba1949.factory.simple;

/**
 * @author anthony
 * @datetime 2020/5/9 13:50
 */
public class SimpleFactoryApp {
    public static void main(String[] args) {
        // 声明生成 Pizza 的工厂
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        // 创建 Pizza 店铺
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
        // 用户订购 Pizza
        Pizza pizza = pizzaStore.orderPizza("cheese");
        // 得到 Pizza
        System.out.println(pizza.toString());
    }
}
