package top.simba1949.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/23 14:15
 */
@Slf4j
public class TenderProjectStrategy implements ProjectStrategy {

    @Override
    public void dealWithProject() {
        log.info("招标项目");
    }
}