package top.simba1949.visitor;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/24 21:00
 */
@Slf4j
public class Cat implements Animal {

    @Override
    public void accept(Person person) {
        log.info("Cat 访问者{}正在访问{}", person, this);
        // 访问者访问
        person.feed(this);
    }
}