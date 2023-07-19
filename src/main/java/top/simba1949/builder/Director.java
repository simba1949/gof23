package top.simba1949.builder;

import lombok.Data;

/**
 * @author anthony
 * @datetime 2023/7/19 21:23
 */
@Data
public class Director {
    private Builder builder;

    /**
     * 提供一个有参构造
     * @param builder
     */
    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 指挥者指挥组装汽车
     * @return
     */
    public Car construct(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.getResult();
    }
}