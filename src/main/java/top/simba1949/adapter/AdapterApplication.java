package top.simba1949.adapter;

import lombok.extern.slf4j.Slf4j;
import top.simba1949.adapter.classAdapter.SDTFClassAdapter;
import top.simba1949.adapter.objAdapter.SDTFObjAdapter;

/**
 * @author anthony
 * @datetime 2023/7/20 22:16
 */
@Slf4j
public class AdapterApplication {
    public static void main(String[] args) {
        // 类适配器
        // classAdapter();

        // 对象适配器
        objAdapter();
    }

    public static void objAdapter() {
        // 创建计算机对象
        Computer computer = new Computer();
        // 读取 SD 卡中的对象
        String msg = computer.readSD(new SDCardImpl());
        log.info("从 SD 卡中读取的数据是：{}", msg);

        TFCardImpl tfCard = new TFCardImpl();
        SDTFObjAdapter sdtfObjAdapter = new SDTFObjAdapter();
        sdtfObjAdapter.setTfCard(tfCard);
        String msg2 = computer.readSD(sdtfObjAdapter);
        log.info("从 SDTFAdapter 卡中读取的数据是：{}", msg2);
    }

    public static void classAdapter() {
        // 创建计算机对象
        Computer computer = new Computer();
        // 读取 SD 卡中的对象
        String msg = computer.readSD(new SDCardImpl());
        log.info("从 SD 卡中读取的数据是：{}", msg);

        String msg2 = computer.readSD(new SDTFClassAdapter());
        log.info("从 SDTFAdapter 卡中读取的数据是：{}", msg2);
    }
}