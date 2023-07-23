package top.simba1949.template.method;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/23 11:34
 */
@Slf4j
public class BaoCaiConcreteClass extends AbstractClass {

    @Override
    void pourVegetable() {
        log.info("包菜");
    }

    @Override
    void pourSauce() {
        log.info("包菜调理");
    }
}