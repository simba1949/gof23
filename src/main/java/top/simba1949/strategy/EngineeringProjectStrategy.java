package top.simba1949.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/23 14:16
 */
@Slf4j
public class EngineeringProjectStrategy implements ProjectStrategy {

    @Override
    public void dealWithProject() {
        log.info("工程项目");
    }
}