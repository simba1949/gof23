package top.simba1949.composite;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author anthony
 * @datetime 2023/7/22 16:41
 */
@Slf4j
public class Menu extends MenuComponent {

    private List<MenuComponent> childList = new ArrayList<>();

    public Menu(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    void add(MenuComponent menuComponent) {
        childList.add(menuComponent);
    }

    @Override
    void remove(MenuComponent menuComponent) {
        childList.remove(menuComponent);
    }

    @Override
    MenuComponent getChild(int index) {
        return childList.get(index);
    }

    @Override
    void print() {
        log.info("当前菜单名称：{}", name);
        for (MenuComponent menuComponent : childList) {
            menuComponent.print();
        }
    }
}