package top.simba1949.factory.abs;

/**
 * 1. 首次创建抽象工厂用来生成原料，
 * 2. 创建每个区域的工厂，实现抽象工厂
 * 3. 抽象Pizza
 * 4. 真实的 Pizza需要继承抽象Pizza，真实的 Pizza 原料有工厂创建
 * 5. 抽象 Pizza 店铺，
 * 6. 创建 Pizza 实体店，在 Pizza 实体店订购 Pizza
 * @Author Theodore
 * @Date 2020/5/9 16:02
 */
public class AbstractFactoryApp {
    public static void main(String[] args) {
        FrancePizzaStore francePizzaStore = new FrancePizzaStore();
        Pizza pizza = francePizzaStore.orderPizza("clam");
        System.out.println(pizza);
    }
}
