package top.simba1949.factory.method.factory;

import lombok.extern.slf4j.Slf4j;
import top.simba1949.factory.method.coffee.AmericanoCoffee;
import top.simba1949.factory.method.coffee.Coffee;

/**
 * @author anthony
 * @datetime 2023/7/15 13:49
 */
@Slf4j
public class AmericanoCoffeeFactory extends CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        Coffee coffee = new AmericanoCoffee();
        coffee.setName("美式咖啡");
        return coffee;
    }
}
