package top.simba1949.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2020/5/16 16:17
 */
@Slf4j
public class ConcreteComponent implements Component {

    /**
     * 实际需要装饰的方法
     */
    @Override
    public void operating() {
        log.info("------我是可爱的分割线-------");
    }
}