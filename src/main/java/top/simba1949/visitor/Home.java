package top.simba1949.visitor;

import lombok.Data;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

/**
 * @author anthony
 * @datetime 2023/7/24 21:01
 */
@Data
public class Home {
    private List<Animal> nodeList = new ArrayList<>();

    public void addAnimal(Animal animal) {
        nodeList.add(animal);
    }

    public void action(Person person) {
        // 遍历集合，获取每一个元素，让访问者访问
        for (Animal animal : nodeList) {
            animal.accept(person);
        }
    }
}