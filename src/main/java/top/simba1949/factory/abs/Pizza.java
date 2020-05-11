package top.simba1949.factory.abs;

import top.simba1949.factory.abs.model.*;

/**
 * @Author Theodore
 * @Date 2020/5/9 15:45
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    /**
     * 准备原料
     */
    abstract void prepare();

    void bake(){
        System.out.println("bake ...");
    }

    void cut(){
        System.out.println("cut ...");
    }

    void box(){
        System.out.println("box ...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
            "name='" + name + '\'' +
            '}';
    }
}
