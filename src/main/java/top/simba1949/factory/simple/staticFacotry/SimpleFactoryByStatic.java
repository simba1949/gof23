package top.simba1949.factory.simple.staticFacotry;

import top.simba1949.factory.simple.pizza.CheesePizza;
import top.simba1949.factory.simple.pizza.GreekPizza;
import top.simba1949.factory.simple.pizza.Pizza;

/**
 * @author anthony
 * @datetime 2020/5/9 12:51
 */
public class SimpleFactoryByStatic {

    public static Pizza orderPizza(String type) {
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