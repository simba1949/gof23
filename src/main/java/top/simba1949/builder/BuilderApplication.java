package top.simba1949.builder;

import lombok.extern.slf4j.Slf4j;
import top.simba1949.builder.ext.Airplane;

import java.util.HashSet;
import java.util.Set;

/**
 * @author anthony
 * @datetime 2023/7/19 21:21
 */
@Slf4j
public class BuilderApplication {
    public static void main(String[] args) {
        // 建造者模式
        // builder();

        // 建造者模式扩展，或者可以使用 lombok 的 @Builder 注解
        builderExt();
    }

    public static void builderExt(){
        Airplane airplane = new Airplane.Builder()
                .engine("引擎")
                .nose("机头")
                .fuselage("机身")
                .wing("机翼")
                .tail("机翼")
                .build();
        log.info("Airplane is {}", airplane);
    }

    public static void builder(){
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
