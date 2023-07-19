package top.simba1949.proxy.staticState;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/19 22:31
 */
@Slf4j
public class ProxyTrainStation implements SellTicket {

    // 声明火车站类对象
    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        log.info("代售点收取服务费");
        trainStation.sell();
    }
}