package top.simba1949.interpreter;


/**
 * 减法
 *
 * @author anthony
 * @datetime 2023/7/25 8:40
 */
public class Minus extends AbstractExpression {

    // 减号左边的表达式
    private AbstractExpression left;
    // 减号右边的表达式
    private AbstractExpression right;

    public Minus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        // 将左边表达式的结果和右边表达式的结果相减
        return left.interpret(context) - right.interpret(context);
    }

    @Override
    public String toString() {
        return "Minus{" +
                "left=" + left.toString() +
                ", right=" + right.toString() +
                '}';
    }
}