package top.simba1949.factory.simple;

import lombok.extern.slf4j.Slf4j;
import top.simba1949.factory.simple.commonFactory.SimpleFactoryByCommon;
import top.simba1949.factory.simple.pizza.Pizza;
import top.simba1949.factory.simple.staticFacotry.SimpleFactoryByStatic;

/**
 * @author anthony
 * @datetime 2020/5/9 13:50
 */
@Slf4j
public class SimpleFactoryApplication {
    public static void main(String[] args) {
        String pizzaType = "cheese";

        // 简单工厂（静态）模式
        // simpleFactoryByStatic(pizzaType);

        // 简单工厂（普通）模式
        simpleFactoryByCommon(pizzaType);
    }

    public static void simpleFactoryByStatic(String pizzaType){
        // 用户订购 Pizza
        Pizza pizza = SimpleFactoryByStatic.orderPizza(pizzaType);
        // 得到 Pizza
        log.info("简单工厂（静态）：订购的披萨是{}", pizza);
    }

    public static void simpleFactoryByCommon(String pizzaType){
        SimpleFactoryByCommon simpleFactoryByCommon = new SimpleFactoryByCommon();
        // 用户订购 Pizza
        Pizza pizza = simpleFactoryByCommon.orderPizza(pizzaType);
        // 得到 Pizza
        log.info("简单工厂（普通）：订购的披萨是{}", pizza);
    }
}