package top.simba1949.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/20 22:15
 */
@Slf4j
public class Computer {

    public String readSD(SDCard sdCard) {
        if (null == sdCard) {
            throw new RuntimeException("sd card is not null");
        }

        return sdCard.readSD();
    }
}