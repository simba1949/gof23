package top.simba1949.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/19 21:10
 */
@Slf4j
public class AudiBuilder extends Builder {

    @Override
    void buildFrame() {
        car.setFrame("奥迪的车架");
    }

    @Override
    void buildSeat() {
        car.setSeat("奥迪的座椅");
    }

    @Override
    Car getResult() {
        return car;
    }
}