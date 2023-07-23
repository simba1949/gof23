package top.simba1949.strategy;

/**
 * @author anthony
 * @datetime 2023/7/23 14:17
 */
public class StrategyApplication {

    public static void main(String[] args) {
        ProjectStrategyContext.dealWith(ProjectEnum.BID);

        ProjectStrategyContext2 projectStrategyContext2 = new ProjectStrategyContext2();
        projectStrategyContext2.dealWith(ProjectEnum.ENGINEERING);
    }
}