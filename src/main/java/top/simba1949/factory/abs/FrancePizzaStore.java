package top.simba1949.factory.abs;

/**
 * @author anthony
 * @datetime 2020/5/9 15:58
 */
public class FrancePizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new FranceIngredientFactory();
        if ("cheese".equalsIgnoreCase(type)){
            CheesePizza cheesePizza = new CheesePizza(pizzaIngredientFactory);
            cheesePizza.setName("cheesePizza");
            return cheesePizza;
        }else if ("clam".equalsIgnoreCase(type)){
            ClamPizza clamPizza = new ClamPizza(pizzaIngredientFactory);
            clamPizza.setName("clamPizza");
            return clamPizza;
        }
        return pizza;
    }
}
