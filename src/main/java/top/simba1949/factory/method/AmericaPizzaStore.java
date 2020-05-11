package top.simba1949.factory.method;

/**
 * Pizza 美国店铺
 * @Author Theodore
 * @Date 2020/5/9 13:49
 */
public class AmericaPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equalsIgnoreCase(type)){
            CheesePizza cheesePizza = new CheesePizza();
            cheesePizza.setName("cheese");
            return cheesePizza;
        }else if ("pineapple".equalsIgnoreCase(type)){
            PineapplePizza pineapplePizza = new PineapplePizza();
            pineapplePizza.setName("pineapple");
            return pineapplePizza;
        }else if ("common".equalsIgnoreCase(type)){
            CommonCheesePizza commonCheesePizza = new CommonCheesePizza();
            commonCheesePizza.setName("common");
            return commonCheesePizza;
        }
        return null;
    }
}