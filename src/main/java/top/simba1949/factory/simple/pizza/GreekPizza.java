package top.simba1949.factory.simple.pizza;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2020/5/9 11:52
 */
@Slf4j
public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        log.info("希腊风味Pizza原材料准备中。。。");
    }
}