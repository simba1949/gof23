package top.simba1949.factory.simple.pizza;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2020/5/9 11:45
 */
@Slf4j
@Data
public abstract class Pizza {

    protected String name;

    /**
     * 准备原材料，每种 Pizza 原材料不一致
     */
    public abstract void prepare();

    /**
     * Pizza 烘烤
     */
    public void bake() {
        log.info("{} : baking", name);
    }

    /**
     * Pizza 切割
     */
    public void cut() {
        log.info("{} : cutting", name);
    }

    /**
     * Pizza 打包
     */
    public void box() {
        log.info("{} : boxing", name);
    }
}