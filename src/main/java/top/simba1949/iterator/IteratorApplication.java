package top.simba1949.iterator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/24 20:01
 */
@Slf4j
public class IteratorApplication {

    public static void main(String[] args) {
        StudentAggregate studentAggregate = new StudentAggregateImpl();
        studentAggregate.add(new Student("1", "1"));
        studentAggregate.add(new Student("2", "2"));
        studentAggregate.add(new Student("3", "3"));
        studentAggregate.add(new Student("4", "4"));

        StudentIterator iterator = studentAggregate.getIterator();
        while (iterator.hasNext()) {
            log.info("当前获取对象信息是：{}", iterator.next());
        }
    }
}