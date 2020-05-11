package top.simba1949.factory.simple;

/**
 * Pizza 店
 * @Author Theodore
 * @Date 2020/5/9 12:53
 */
public class PizzaStore {

    SimplePizzaFactory simplePizzaFactory;

    /**
     * 用户根据自己的喜好，订购指定之类的 Pizza
     * orderPizza() 方法只需要关心从工厂中得到一个 Pizza
     *
     * @param type
     * @return
     */
    public Pizza orderPizza(String type){
        Pizza pizza;
        // 工厂根据客户喜好用于创建Pizza对象
        pizza = simplePizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }
}