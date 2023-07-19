package top.simba1949.proxy.javassist;

import javassist.util.proxy.MethodHandler;
import javassist.util.proxy.ProxyFactory;
import javassist.util.proxy.ProxyObject;

/**
 * @author anthony
 * @datetime 2023/7/19 23:32
 */
public class JavassistProxyFactory {

    public static <T> T getProxy(Class<T> targetCls, MethodHandler methodHandler) throws InstantiationException, IllegalAccessException {
        // 创建代理工厂
        ProxyFactory proxyFactory = new ProxyFactory();
        // 设置代理类的父类，也是被代理类
        proxyFactory.setSuperclass(targetCls);
        // 生成动态代理类
        Class<?> aClass = proxyFactory.createClass();
        // 创建动态代理类的实例
        Object proxyInstance = aClass.newInstance();
        // 设置动态处理方式
        ((ProxyObject)proxyInstance).setHandler(methodHandler);

        return ((T) proxyInstance);
    }
}