package top.simba1949.interpreter;

/**
 * @author anthony
 * @datetime 2023/7/25 8:38
 */
public class Value extends AbstractExpression {

    private Integer value;

    public Value(Integer value) {
        this.value = value;
    }

    @Override
    public int interpret(Context context) {
        return 0;
    }

    @Override
    public String toString() {
        return "Value{" +
                "value=" + value +
                '}';
    }
}
