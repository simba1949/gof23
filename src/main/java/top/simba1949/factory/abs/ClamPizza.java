package top.simba1949.factory.abs;

/**
 * @Author Theodore
 * @Date 2020/5/9 15:54
 */
public class ClamPizza extends Pizza{

    PizzaIngredientFactory pizzaIngredientFactory;

    @Override
    void prepare() {
        System.out.println("ClamPizza");
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        clams = pizzaIngredientFactory.createClams();
    }

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
}
