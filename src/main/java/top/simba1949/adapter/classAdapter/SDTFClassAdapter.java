package top.simba1949.adapter.classAdapter;

import lombok.extern.slf4j.Slf4j;
import top.simba1949.adapter.SDCard;
import top.simba1949.adapter.TFCardImpl;

/**
 * 适配器类
 *
 * @author anthony
 * @datetime 2023/7/20 22:19
 */
@Slf4j
public class SDTFClassAdapter extends TFCardImpl implements SDCard {

    @Override
    public String readSD() {
        log.info("SDTFAdapter read msg");
        return super.readTF();
    }

    @Override
    public void writeSD(String msg) {
        log.info("SDTFAdapter write msg : {}", msg);
        super.writeTF(msg);
    }
}