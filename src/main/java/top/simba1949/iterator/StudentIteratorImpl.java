package top.simba1949.iterator;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @author anthony
 * @datetime 2023/7/24 20:15
 */
@Slf4j
public class StudentIteratorImpl implements StudentIterator {

    private List<Student> list;
    private int position; // 用于记录遍历时的位置

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        // 从集合中获取指定位置的元素
        Student student = list.get(position);
        // 角标移动下一个
        ++position;
        return student;
    }
}