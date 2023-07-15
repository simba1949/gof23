package top.simba1949.factory.method;


import lombok.extern.slf4j.Slf4j;
import top.simba1949.factory.method.coffee.Coffee;
import top.simba1949.factory.method.factory.AmericanoCoffeeFactory;
import top.simba1949.factory.method.factory.CoffeeFactory;

/**
 * @author anthony
 * @datetime 2020/5/9 14:30
 */
@Slf4j
public class MethodFactoryApplication {

    public static void main(String[] args) {
        // 创建咖啡店对象
        CoffeeStore coffeeStore = new CoffeeStore();
        // 创建工厂对象
        CoffeeFactory coffeeFactory = new AmericanoCoffeeFactory();
        coffeeStore.setCoffeeFactory(coffeeFactory);
        // 订购咖啡
        Coffee coffee = coffeeStore.orderCoffee();
        log.info("订购的咖啡是：{}", coffee);
    }
}