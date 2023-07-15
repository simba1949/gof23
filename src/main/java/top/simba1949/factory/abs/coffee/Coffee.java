package top.simba1949.factory.abs.coffee;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/15 14:26
 */
@Slf4j
@Data
public abstract class Coffee {

    private String name;

    public void addMilk(){
        log.info("{} 添加了牛奶", name);
    }

    public void addSugar(){
        log.info("{} 添加了糖", name);
    }
}