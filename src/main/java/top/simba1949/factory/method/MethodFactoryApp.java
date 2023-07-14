package top.simba1949.factory.method;

/**
 * @author anthony
 * @datetime 2020/5/9 14:30
 */
public class MethodFactoryApp {
    public static void main(String[] args) {
        JapanPizzaStore japanPizzaStore = new JapanPizzaStore();
        Pizza commonPizza = japanPizzaStore.orderPizza("common");
        System.out.println(commonPizza);

        AmericaPizzaStore americaPizzaStore = new AmericaPizzaStore();
        Pizza pineapple = americaPizzaStore.orderPizza("pineapple");
        System.out.println(pineapple);
    }
}