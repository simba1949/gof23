package top.simba1949.chain.of.responsibility;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/23 16:04
 */
@Slf4j
@Data
public abstract class AbstractHandler {

    private AbstractHandler nextHandler;
    private Integer dayThreshold;

    abstract void doHandler(LevelRequest levelRequest);

    /**
     * 提交处理
     *
     * @param levelRequest
     */
    public final void submit(LevelRequest levelRequest) {
        // 当前领导审批
        this.doHandler(levelRequest);

        if (null != this.getNextHandler() && levelRequest.getDayNum() > this.dayThreshold) {
            this.nextHandler.submit(levelRequest);
        } else {
            log.info("流程结束！");
        }
    }
}