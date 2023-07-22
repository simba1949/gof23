package top.simba1949.composite;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/22 16:42
 */
@Slf4j
public class MenuItem extends MenuComponent {

    public MenuItem(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    void print() {
        log.info("当前菜单项的名称是：{}", name);
    }
}