package top.simba1949.factory.simple;

/**
 * SimplePizzaFactory 只做一件事情——帮助客户创建 Pizza
 * 示例中只有 PizzaStore.orderPizza() 是 SimplePizzaFactory 的客户，可能还会有 PizzaShopMenu 或者 HomeDelivery等客户
 * 总而言之，SimplePizzaFactory 可以服务于很多客户，当创建 Pizza 改变时，只需要改变这个类即可
 *
 * 静态工厂定一个简单的工厂，为何使用静态方法，因为不需要使用创建对象的方法来实例化对象。缺点是，不能通过继承来改变创建方法的行为；
 * @Author Theodore
 * @Date 2020/5/9 12:51
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;

        if ("cheese".equalsIgnoreCase(type)){
            pizza = new CheesePizza();
            pizza.setName("cheese");
        }else if ("greek".equalsIgnoreCase(type)){
            pizza = new GreekPizza();
            pizza.setName("greek");
        }

        return pizza;
    }
}