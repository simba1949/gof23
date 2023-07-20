package top.simba1949.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/20 22:11
 */
@Slf4j
public class TFCardImpl implements TFCard {

    @Override
    public String readTF() {
        return "TFCard read msg : Hello TF!";
    }

    @Override
    public void writeTF(String msg) {
        log.info("TFCard read msg : {}", msg);
    }
}