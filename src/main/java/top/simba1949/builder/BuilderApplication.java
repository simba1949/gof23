package top.simba1949.builder;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

/**
 * @author anthony
 * @datetime 2023/7/19 21:21
 */
@Slf4j
public class BuilderApplication {
    public static void main(String[] args) {
        Set<Car> result = new HashSet<>();

        for (int i = 0; i < 1000; i++) {
            Director director = new Director(new AudiBuilder());
            Car construct = director.construct();

            result.add(construct);
            log.info("car is {}, car = {}", construct.hashCode(), construct);
        }

        log.info("size = {}", result.size());
    }
}
