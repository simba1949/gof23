package top.simba1949.flyweight;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/22 20:34
 */
@Slf4j
public class IBox extends AbstractBox {

    @Override
    public String getShape() {
        return "I";
    }
}