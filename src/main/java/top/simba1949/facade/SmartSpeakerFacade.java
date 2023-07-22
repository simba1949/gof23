package top.simba1949.facade;

import lombok.extern.slf4j.Slf4j;


/**
 * @author anthony
 * @datetime 2023/7/22 14:56
 */
@Slf4j
public class SmartSpeakerFacade {

    private Light light;
    private TV tv;
    private AirConditioner airConditioner;

    public SmartSpeakerFacade() {
        this.light = new Light();
        this.tv = new TV();
        this.airConditioner = new AirConditioner();
    }

    public void sayMessage(String message) {
        // 解析语音
        if ("on".equalsIgnoreCase(message)) {
            light.on();
            tv.on();
            airConditioner.on();
        } else if ("off".equalsIgnoreCase(message)) {
            light.off();
            tv.off();
            airConditioner.off();
        } else {
            log.info("我还听不懂你说的！");
        }
    }
}