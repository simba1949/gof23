package top.simba1949.proxy.cglib;

import lombok.extern.slf4j.Slf4j;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author anthony
 * @datetime 2023/7/19 22:57
 */
@Slf4j
public class CglibMethodInterceptor implements MethodInterceptor {

    /**
     * @param obj         表示增强的对象
     * @param method      表示被拦截的方法；
     * @param objects     表示被拦截方法的参数；
     * @param methodProxy 表示要触发父类的方法对象；
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object obj,
                            Method method,
                            Object[] objects,
                            MethodProxy methodProxy) throws Throwable {
        log.info("do something before");
        // result 是返回结果
        Object result = methodProxy.invokeSuper(obj, objects);
        log.info("do something after");
        return result;
    }
}