package top.simba1949.factory.abs;

import top.simba1949.factory.abs.model.*;

/**
 * @author anthony
 * @datetime 2020/5/11 16:25
 */
public class AmericaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickGrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzareallCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
