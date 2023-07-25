package top.simba1949.interpreter;

import lombok.Data;

/**
 * 加法
 *
 * @author anthony
 * @datetime 2023/7/25 8:40
 */
public class Plus extends AbstractExpression {

    // 加号左边的表达式
    private AbstractExpression left;
    // 加号右边的表达式
    private AbstractExpression right;

    public Plus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        // 将左边表达式的结果和右边表达式的结果相加
        return left.interpret(context) + right.interpret(context);
    }

    @Override
    public String toString() {
        return "Plus{" +
                "left=" + left.toString() +
                ", right=" + right.toString() +
                '}';
    }
}
