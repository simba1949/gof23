package top.simba1949.factory.abs;

import lombok.extern.slf4j.Slf4j;
import top.simba1949.factory.abs.coffee.Coffee;
import top.simba1949.factory.abs.dessert.Dessert;
import top.simba1949.factory.abs.factory.ItalyFactory;

/**
 * @author anthony
 * @datetime 2023/7/15 14:37
 */
@Slf4j
public class AbsFactoryApplication {

    public static void main(String[] args) {
        ItalyFactory italyFactory = new ItalyFactory();

        Coffee coffee = italyFactory.createCoffee();
        log.info("订购的咖啡是：{}", coffee);

        Dessert dessert = italyFactory.createDessert();
        log.info("订购的甜品是：{}", dessert);
    }
}
