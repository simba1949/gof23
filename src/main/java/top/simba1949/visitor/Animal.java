package top.simba1949.visitor;

/**
 * @author anthony
 * @datetime 2023/7/24 21:00
 */
public interface Animal {

    /**
     * 接受访问者访问的方法
     *
     * @param person
     */
    void accept(Person person);
}