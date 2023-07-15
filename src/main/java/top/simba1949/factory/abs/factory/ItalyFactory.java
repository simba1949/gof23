package top.simba1949.factory.abs.factory;

import lombok.extern.slf4j.Slf4j;
import top.simba1949.factory.abs.coffee.Coffee;
import top.simba1949.factory.abs.coffee.LatteCoffee;
import top.simba1949.factory.abs.dessert.Dessert;
import top.simba1949.factory.abs.dessert.TiramisuDessert;

/**
 * @author anthony
 * @datetime 2023/7/15 14:32
 */
@Slf4j
public class ItalyFactory extends AbsFactory {

    @Override
    public Coffee createCoffee() {
        Coffee coffee = new LatteCoffee();
        coffee.setName("拿铁咖啡");
        coffee.addMilk();
        return coffee;
    }

    @Override
    public Dessert createDessert() {
        Dessert dessert = new TiramisuDessert();
        dessert.setName("提拉米苏");
        return dessert;
    }
}