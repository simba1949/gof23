package top.simba1949.visitor;

import top.simba1949.visitor.dispatch.doubleDispatch.DoubleDispatchAnimal;
import top.simba1949.visitor.dispatch.doubleDispatch.DoubleDispatchCat;
import top.simba1949.visitor.dispatch.doubleDispatch.DoubleDispatchDog;
import top.simba1949.visitor.dispatch.doubleDispatch.DoubleDispatchExecute;
import top.simba1949.visitor.dispatch.dynamicDispatch.DynamicDispatchAnimal;
import top.simba1949.visitor.dispatch.dynamicDispatch.DynamicDispatchCatAnimal;
import top.simba1949.visitor.dispatch.dynamicDispatch.DynamicDispatchDogAnimal;
import top.simba1949.visitor.dispatch.staticDispatch.StaticDispatchExecute;

/**
 * @author anthony
 * @datetime 2023/7/24 20:59
 */
public class VisitorApplication {

    public static void main(String[] args) {
        // 访问者模式
        // visitor();

        // 动态分派
        // dynamicDispatch();

        // 静态分派
        // staticDispatch();

        // 双分派
        doubleDispatch();
    }

    /**
     * 双分派
     */
    public static void doubleDispatch(){
        DoubleDispatchAnimal animal = new DoubleDispatchAnimal();
        DoubleDispatchAnimal cat = new DoubleDispatchCat();
        DoubleDispatchAnimal dog = new DoubleDispatchDog();

        DoubleDispatchExecute execute = new DoubleDispatchExecute();
        animal.accept(execute);
        cat.accept(execute);
        dog.accept(execute);
        // 结果是：
        // - DoubleDispatchAnimal
        // - DoubleDispatchCat
        // - DoubleDispatchDog
    }

    /**
     * 静态分派
     */
    public static void staticDispatch(){
        Object obj = new Object();
        Object str = new String();
        Object integer = new Integer(1);

        StaticDispatchExecute execute = new StaticDispatchExecute();
        execute.execute(obj);
        execute.execute(str);
        execute.execute(integer);
        // 结果是：
        // - execute Object
        // - execute Object
        // - execute Object
    }

    /**
     * 动态分派
     */
    public static void dynamicDispatch(){
        DynamicDispatchAnimal catAnimal = new DynamicDispatchCatAnimal();
        catAnimal.execute();

        DynamicDispatchAnimal dogAnimal = new DynamicDispatchDogAnimal();
        dogAnimal.execute();
    }

    public static void visitor(){
        Home home = new Home();

        Dog dog = new Dog();
        Cat cat = new Cat();
        home.addAnimal(dog);
        home.addAnimal(cat);

        Owner owner = new Owner();
        home.action(owner);

        Someone someone = new Someone();
        home.action(someone);
    }
}