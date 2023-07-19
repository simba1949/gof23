package top.simba1949.proxy.staticState;

import lombok.extern.slf4j.Slf4j;

/**
 * 火车站
 * @author anthony
 * @datetime 2023/7/19 22:31
 */
@Slf4j
public class TrainStation implements SellTicket {

    @Override
    public void sell() {
        log.info("火车站卖票");
    }
}