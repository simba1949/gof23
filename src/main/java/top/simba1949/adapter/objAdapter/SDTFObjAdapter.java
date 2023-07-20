package top.simba1949.adapter.objAdapter;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import top.simba1949.adapter.SDCard;
import top.simba1949.adapter.TFCard;

/**
 * @author anthony
 * @datetime 2023/7/20 23:41
 */
@Slf4j
@Data
public class SDTFObjAdapter implements SDCard {

    private TFCard tfCard;

    @Override
    public String readSD() {
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        tfCard.writeTF(msg);
    }
}