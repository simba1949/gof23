package top.simba1949.factory.method;

/**
 * Pizza 日本店铺
 * @author anthony
 * @datetime 2020/5/9 13:48
 */
public class JapanPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equalsIgnoreCase(type)){
            CheesePizza cheesePizza = new CheesePizza();
            cheesePizza.setName("cheese");
            return cheesePizza;
        }else if ("common".equalsIgnoreCase(type)){
            CommonCheesePizza commonCheesePizza = new CommonCheesePizza();
            commonCheesePizza.setName("common");
            return commonCheesePizza;
        }
        return null;
    }
}