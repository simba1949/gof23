package top.simba1949.factory.abs;

/**
 * @Author Theodore
 * @Date 2020/5/9 15:52
 */
public class CheesePizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory;
    @Override
    void prepare() {
        System.out.println("CheesePizza");
        // dough/sauce/cheese 把Pizza的实例变量设置为此Pizza所使用的某种成分
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
}