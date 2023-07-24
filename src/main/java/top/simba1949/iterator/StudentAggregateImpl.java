package top.simba1949.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author anthony
 * @datetime 2023/7/24 20:19
 */
public class StudentAggregateImpl implements StudentAggregate {

    private List<Student> list = new ArrayList<>();

    @Override
    public void add(Student student) {
        list.add(student);
    }

    @Override
    public void remove(Student student) {
        list.remove(student);
    }

    @Override
    public StudentIterator getIterator() {
        return new StudentIteratorImpl(list);
    }
}