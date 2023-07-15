package top.simba1949.factory.simple.commonFactory;

import top.simba1949.factory.simple.pizza.CheesePizza;
import top.simba1949.factory.simple.pizza.GreekPizza;
import top.simba1949.factory.simple.pizza.Pizza;

/**
 * @author anthony
 * @datetime 2023/7/15 13:19
 */
public class SimpleFactoryByCommon {

    public Pizza orderPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equalsIgnoreCase(type)) {
            pizza = new CheesePizza();
            pizza.setName("cheese");
        } else if ("greek".equalsIgnoreCase(type)) {
            pizza = new GreekPizza();
            pizza.setName("greek");
        }

        if (null != pizza){
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }

        return pizza;
    }
}
