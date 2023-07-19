package top.simba1949.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/19 21:11
 */
@Slf4j
public class BenzBuilder extends Builder {

    @Override
    void buildFrame() {
        car.setFrame("奔驰的车架");
    }

    @Override
    void buildSeat() {
        car.setSeat("奔驰的座椅");
    }

    @Override
    Car getResult() {
        return car;
    }
}