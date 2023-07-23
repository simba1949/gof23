package top.simba1949.strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author anthony
 * @datetime 2023/7/23 14:19
 */
@Getter
@AllArgsConstructor
public enum ProjectEnum {

    BID(1, "竞价项目"),
    TENDER(2, "招标项目"),
    ENGINEERING(3, "工程项目");

    private final int code;
    private final String desc;
}