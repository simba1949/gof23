package top.simba1949.flyweight;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/22 20:33
 */
@Slf4j
public abstract class AbstractBox {

    /**
     * 获取图像
     *
     * @return
     */
    public abstract String getShape();

    /**
     * 展示颜色
     *
     * @param color
     */
    public void display(String color) {
        log.info("俄罗斯方块的形状是：{}，颜色是：{}", getShape(), color);
    }
}