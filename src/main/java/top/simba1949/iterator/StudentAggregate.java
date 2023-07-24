package top.simba1949.iterator;

/**
 * @author anthony
 * @datetime 2023/7/24 20:18
 */
public interface StudentAggregate {

    void add(Student student);

    void remove(Student student);

    StudentIterator getIterator();
}