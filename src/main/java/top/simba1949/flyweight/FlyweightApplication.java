package top.simba1949.flyweight;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/22 20:42
 */
@Slf4j
public class FlyweightApplication {

    public static void main(String[] args) {
        BoxFactory instance = BoxFactory.getInstance();
        // 获取 I 图形
        AbstractBox boxI = instance.getShape("I");
        boxI.display("灰色");
        // 获取 L 图形
        AbstractBox boxL = instance.getShape("L");
        boxL.display("绿色");
        // 获取 T 图形
        AbstractBox boxT0 = instance.getShape("T");
        boxT0.display("红色");

        AbstractBox boxT1 = instance.getShape("T");
        boxT1.display("蓝色");
        log.info("boxT0 == boxT1 ? {}", boxT0 == boxT1);
    }
}
