package top.simba1949.interpreter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/25 8:19
 */
@Slf4j
public class InterpreterApplication {

    public static void main(String[] args) {
        // 创建环境对象
        Context context = new Context();

        // 创建多个变量对象
        Variable varA = new Variable("a");
        Variable varB = new Variable("b");
        Variable varC = new Variable("c");
        Variable varD = new Variable("d");
        // 将变量存储在上下文中
        context.assign(varA, 1);
        context.assign(varB, 2);
        context.assign(varC, 3);
        context.assign(varD, 4);

        // 获取抽象语法树：(a - ((b - c) + d))
        AbstractExpression expression = new Minus(varA, new Plus(new Minus(varB, varC), varD));
        // 解释（计算）
        int interpret = expression.interpret(context);
        log.info("(a - ((b - c) + d)) = {}", interpret);
    }
}