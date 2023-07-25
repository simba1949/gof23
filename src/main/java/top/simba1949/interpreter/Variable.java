package top.simba1949.interpreter;

import lombok.Data;

/**
 * 用于封装变量的类
 *
 * @author anthony
 * @datetime 2023/7/25 8:37
 */
@Data
public class Variable extends AbstractExpression {

    /**
     * 声明存储变量名的成员变量
     */
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {
        // 直接返回变量的值
        return context.getVal(this);
    }
}