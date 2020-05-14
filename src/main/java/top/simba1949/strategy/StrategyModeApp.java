package top.simba1949.strategy;

/**
 * 策略模式测试应力
 * @Author Theodore
 * @Date 2020/5/11 17:42
 */
public class StrategyModeApp {
    public static void main(String[] args) {
        //
        StrategyModeOneImpl strategyModeOne = new StrategyModeOneImpl();
        StrategyModeTwoImpl strategyModeTwo = new StrategyModeTwoImpl();
        Client client = new Client();
        client.setStrategyMode(strategyModeOne);
        client.getStrategyMode().print();

        client.setStrategyMode(strategyModeTwo);
        client.getStrategyMode().print();
    }
}
