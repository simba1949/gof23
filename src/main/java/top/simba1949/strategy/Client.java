package top.simba1949.strategy;

/**
 * @author anthony
 * @datetime 2020/5/11 20:47
 */
public class Client {

    private IStrategyMode strategyMode;

    public void setStrategyMode(IStrategyMode strategyMode) {
        this.strategyMode = strategyMode;
    }

    public IStrategyMode getStrategyMode() {
        return strategyMode;
    }
}
