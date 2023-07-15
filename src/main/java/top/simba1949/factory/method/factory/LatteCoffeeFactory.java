package top.simba1949.factory.method.factory;

import lombok.extern.slf4j.Slf4j;
import top.simba1949.factory.method.coffee.Coffee;
import top.simba1949.factory.method.coffee.LatteCoffee;

/**
 * @author anthony
 * @datetime 2023/7/15 13:49
 */
@Slf4j
public class LatteCoffeeFactory extends CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        Coffee coffee = new LatteCoffee();
        coffee.setName("拿铁咖啡");

        return coffee;
    }
}