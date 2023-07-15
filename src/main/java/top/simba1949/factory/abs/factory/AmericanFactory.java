package top.simba1949.factory.abs.factory;

import lombok.extern.slf4j.Slf4j;
import top.simba1949.factory.abs.coffee.AmericanoCoffee;
import top.simba1949.factory.abs.coffee.Coffee;
import top.simba1949.factory.abs.dessert.Dessert;
import top.simba1949.factory.abs.dessert.MatchaMousseDessert;

/**
 * @author anthony
 * @datetime 2023/7/15 14:32
 */
@Slf4j
public class AmericanFactory extends AbsFactory {

    @Override
    public Coffee createCoffee() {
        Coffee coffee = new AmericanoCoffee();
        coffee.setName("美式咖啡");
        coffee.addSugar();
        return coffee;
    }

    @Override
    public Dessert createDessert() {
        Dessert dessert = new MatchaMousseDessert();
        dessert.setName("抹茶慕斯");
        return dessert;
    }
}