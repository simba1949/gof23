package top.simba1949.chain.of.responsibility;

/**
 * @author anthony
 * @datetime 2023/7/23 16:13
 */
public class ChainOfResponsibilityApplication {
    public static void main(String[] args) {
        GroupManager groupManager = new GroupManager();
        DeptManager deptManager = new DeptManager();
        GeneralManager generalManager = new GeneralManager();

        groupManager.setNextHandler(deptManager);
        groupManager.setDayThreshold(1);

        deptManager.setNextHandler(generalManager);
        deptManager.setDayThreshold(7);

        LevelRequest levelRequest = new LevelRequest();
        levelRequest.setName("小明");
        levelRequest.setDayNum(8);
        levelRequest.setContent("请假内容");

        groupManager.submit(levelRequest);
    }
}