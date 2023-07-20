package top.simba1949.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/20 22:13
 */
@Slf4j
public class SDCardImpl implements SDCard {

    @Override
    public String readSD() {
        return "SDCard read msg : Hello SD!";
    }

    @Override
    public void writeSD(String msg) {
        log.info("SDCard read msg : {}", msg);
    }
}