package top.simba1949.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author anthony
 * @datetime 2023/7/25 8:37
 */
public class Context {

    // 定义一个 map，用于存储变量及对应的值
    private Map<Variable, Integer> map = new HashMap<>();

    /**
     * 添加变量的功能
     *
     * @param var
     * @param value
     */
    public void assign(Variable var, Integer value) {
        map.put(var, value);
    }

    /**
     * 根据变量获取对应的值
     *
     * @param var
     * @return
     */
    public int getVal(Variable var) {
        return map.get(var);
    }
}