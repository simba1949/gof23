package top.simba1949.factory.method;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import top.simba1949.factory.method.coffee.Coffee;
import top.simba1949.factory.method.factory.CoffeeFactory;

/**
 * @author anthony
 * @datetime 2023/7/15 13:52
 */
@Slf4j
@Data
public class CoffeeStore {

    public CoffeeFactory coffeeFactory;

    public Coffee orderCoffee(){
        // 这里创建对应的对象
        Coffee coffee = coffeeFactory.createCoffee();

        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}