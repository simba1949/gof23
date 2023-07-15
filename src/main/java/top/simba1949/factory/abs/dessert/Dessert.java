package top.simba1949.factory.abs.dessert;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/15 14:25
 */
@Slf4j
@Data
public abstract class Dessert {

    private String name;

    public void show() {
        log.info("正在展示的甜点是{}", name);
    }
}