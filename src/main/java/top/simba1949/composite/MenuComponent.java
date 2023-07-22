package top.simba1949.composite;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/22 16:39
 */
@Slf4j
@Data
public abstract class MenuComponent {

    protected String name;
    protected Integer level;

    /**
     * 添加
     *
     * @param menuComponent
     */
    void add(MenuComponent menuComponent) {
        // 对于菜单来说，可以添加/移除/获取子菜单，但是对于菜单项来说，则不能
        throw new UnsupportedOperationException();
    }

    /**
     * 移除
     *
     * @param menuComponent
     */
    void remove(MenuComponent menuComponent) {
        // 对于菜单来说，可以添加/移除/获取子菜单，但是对于菜单项来说，则不能
        throw new UnsupportedOperationException();
    }

    /**
     * 获取子菜单列表
     *
     * @param index
     * @return
     */
    MenuComponent getChild(int index) {
        // 对于菜单来说，可以添加/移除/获取子菜单，但是对于菜单项来说，则不能
        throw new UnsupportedOperationException();
    }

    /**
     * 打印
     */
    abstract void print();
}