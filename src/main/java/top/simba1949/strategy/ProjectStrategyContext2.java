package top.simba1949.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author anthony
 * @datetime 2023/7/23 14:24
 */
public class ProjectStrategyContext2 {

    final static Map<ProjectEnum, ProjectStrategy> CONTEXT = new HashMap<ProjectEnum, ProjectStrategy>()
    {
        {
            put(ProjectEnum.BID, new BidProjectStrategy());
            put(ProjectEnum.TENDER, new TenderProjectStrategy());
            put(ProjectEnum.ENGINEERING, new EngineeringProjectStrategy());
        }
    };

    public void dealWith(ProjectEnum projectEnum) {
        ProjectStrategy projectStrategy = CONTEXT.get(projectEnum);
        projectStrategy.dealWithProject();
    }
}