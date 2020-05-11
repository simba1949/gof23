package top.simba1949.factory.abs;

/**
 * @Author Theodore
 * @Date 2020/5/9 15:57
 */
public abstract class PizzaStore {
    /**
     * orderPizza 用于处理订单
     * @param type
     * @return
     */
    public Pizza orderPizza(String type){
        Pizza pizza;
        // 工厂根据客户喜好用于创建Pizza对象
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * 抽象类 Pizza 店，具体创建什么 Pizza 由子类决定
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(String type);
}
