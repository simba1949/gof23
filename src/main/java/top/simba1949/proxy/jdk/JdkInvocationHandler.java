package top.simba1949.proxy.jdk;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author anthony
 * @datetime 2023/7/19 22:40
 */
@Slf4j
public class JdkInvocationHandler implements InvocationHandler {

    // 被代理的类
    private Subject target;

    public JdkInvocationHandler(Subject subject) {
        this.target = subject;
    }

    /**
     * 获取被代理接口实例对象
     * @return
     */
    public Subject getProxy(){
        // 第一个参数是类加载器，用于加载这个代理类，可以通过目标对象获取类加载器
        // 第二个参数是Class数组，里面存放的是待实现的接口信息
        // 第三个参数是InvocationHandler实例，代理对象的调用处理程序
        return (Subject) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }

    /**
     * invoke 方法
     * @param proxy 动态代理的类实例
     * @param method 调用的方法
     * @param args 调用方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("do something before");
        // result 是被代理方法的返回值
        Object result = method.invoke(target, args);
        log.info("do something after");
        return result;
    }
}