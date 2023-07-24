package top.simba1949.visitor;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/24 21:01
 */
@Slf4j
public class Someone implements Person {

    @Override
    public void feed(Cat cat) {
        log.info("Someone 访问者{}正在访问{}", this, cat);
    }

    @Override
    public void feed(Dog dog) {
        log.info("Someone 访问者{}正在访问{}", this, dog);
    }
}