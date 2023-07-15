package top.simba1949.factory.abs.factory;

import top.simba1949.factory.abs.coffee.Coffee;
import top.simba1949.factory.abs.dessert.Dessert;

/**
 * @author anthony
 * @datetime 2023/7/15 14:31
 */
public abstract class AbsFactory {

    public abstract Coffee createCoffee();

    public abstract Dessert createDessert();
}