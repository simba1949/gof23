package top.simba1949.visitor;

/**
 * @author anthony
 * @datetime 2023/7/24 21:00
 */
public interface Person {

    void feed(Cat cat);

    void feed(Dog dog);
}