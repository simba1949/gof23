package top.simba1949.chain.of.responsibility;

import lombok.Data;

/**
 * @author anthony
 * @datetime 2023/7/23 16:04
 */
@Data
public class LevelRequest {

    private String name; // 请假人
    private Integer dayNum; // 请假天数
    private String content; // 请假内容
}