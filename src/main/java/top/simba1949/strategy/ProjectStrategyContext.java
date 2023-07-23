package top.simba1949.strategy;

import java.util.HashMap;
import java.util.Map;
/**
 * @author anthony
 * @datetime 2023/7/23 14:16
 */
public class ProjectStrategyContext {

    public static final Map<ProjectEnum, ProjectStrategy> CONTEXT = new HashMap<>();

    static {
        CONTEXT.put(ProjectEnum.BID, new BidProjectStrategy());
        CONTEXT.put(ProjectEnum.TENDER, new TenderProjectStrategy());
        CONTEXT.put(ProjectEnum.ENGINEERING, new EngineeringProjectStrategy());
    }

    public static void dealWith(ProjectEnum projectEnum){
        ProjectStrategy projectStrategy = CONTEXT.get(projectEnum);
        projectStrategy.dealWithProject();
    }
}