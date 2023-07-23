package top.simba1949.mediator;

import lombok.Data;

/**
 * @author anthony
 * @datetime 2023/7/23 22:27
 */
@Data
public abstract class Person {

    private String name;
    private AbsMediator absMediator;

    public Person(String name, AbsMediator absMediator) {
        this.name = name;
        this.absMediator = absMediator;
    }

    /**
     * 沟通
     *
     * @param message
     */
    public abstract void contact(String message);

    /**
     * 获取信息
     *
     * @param message
     */
    public abstract void getMessage(String message);
}