package top.simba1949.proxy.javassist;

import javassist.util.proxy.MethodHandler;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;

/**
 * @author anthony
 * @datetime 2023/7/19 23:29
 */
@Slf4j
public class JavassistMethodHandler implements MethodHandler {

    /**
     *
     * @param self 代理类的实例
     * @param thisMethod 表示被拦截的方法
     * @param proceed 表示要触发父类的方法对象
     * @param args 表示被拦截方法的参数；
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object self,
                         Method thisMethod,
                         Method proceed,
                         Object[] args) throws Throwable {
        log.info("do something before");
        // result 是返回结果
        Object result = proceed.invoke(self, args);
        log.info("do something after");
        return result;
    }
}