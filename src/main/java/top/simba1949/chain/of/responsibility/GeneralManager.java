package top.simba1949.chain.of.responsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/23 16:06
 */
@Slf4j
public class GeneralManager extends AbstractHandler {

    @Override
    void doHandler(LevelRequest levelRequest) {
        log.info("GeneralManager 审批请假条 {}", levelRequest);
        log.info("GeneralManager PASS");
    }
}