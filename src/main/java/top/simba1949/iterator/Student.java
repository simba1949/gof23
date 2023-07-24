package top.simba1949.iterator;

import lombok.Data;

/**
 * @author anthony
 * @datetime 2023/7/24 20:14
 */
@Data
public class Student {

    private String name;
    private String number;

    public Student(String name, String number) {
        this.name = name;
        this.number = number;
    }
}