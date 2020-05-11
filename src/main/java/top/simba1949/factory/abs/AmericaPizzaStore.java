package top.simba1949.factory.abs;

/**
 * @Author Theodore
 * @Date 2020/5/11 16:26
 */
public class AmericaPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new AmericaIngredientFactory();

        //

        return pizza;
    }
}
