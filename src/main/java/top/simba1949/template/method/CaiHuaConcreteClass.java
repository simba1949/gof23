package top.simba1949.template.method;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/23 11:35
 */
@Slf4j
public class CaiHuaConcreteClass extends AbstractClass {

    @Override
    void pourVegetable() {
        log.info("菜花");
    }

    @Override
    void pourSauce() {
        log.info("菜花调料");
    }
}