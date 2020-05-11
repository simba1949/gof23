package top.simba1949.factory.abs;

import top.simba1949.factory.abs.model.*;

/**
 * 原料工厂
 *
 * @Author Theodore
 * @Date 2020/5/9 15:29
 */
public interface PizzaIngredientFactory {
    /**
     * 面团
     * @return
     */
    Dough createDough();

    /**
     * 酱
     * @return
     */
    Sauce createSauce();

    /**
     * 芝士
     * @return
     */
    Cheese createCheese();

    /**
     * 蔬菜
     * @return
     */
    Veggies[] createVeggies();

    /**
     * 香肠
     * @return
     */
    Pepperoni createPepperoni();

    /**
     * 蛤蜊
     * @return
     */
    Clams createClams();
}
