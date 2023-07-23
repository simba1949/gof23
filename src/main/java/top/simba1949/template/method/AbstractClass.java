package top.simba1949.template.method;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/23 11:32
 */
@Slf4j
public abstract class AbstractClass {

    /**
     * <b>模板方法</b>
     * 禁止子类重写目标方法
     */
    public final void cookProcess() {
        this.pourOil();
        this.heatOil();
        this.pourVegetable();
        this.pourSauce();
        this.fry();
    }

    void pourOil() {
        log.info("倒油");
    }

    void heatOil() {
        log.info("热油");
    }

    abstract void pourVegetable();

    abstract void pourSauce();

    void fry() {
        log.info("炒啊炒，炒到熟！");
    }
}