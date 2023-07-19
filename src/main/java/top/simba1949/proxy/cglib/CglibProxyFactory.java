package top.simba1949.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * @author anthony
 * @datetime 2023/7/19 23:05
 */
public class CglibProxyFactory {

    public static SubjectService getProxyObj(Class<?> targetCls, MethodInterceptor methodInterceptor) {
        // 通过CGLIB动态代理获取代理对象的过程
        Enhancer enhancer = new Enhancer();
        // 设置enhancer对象的父类
        enhancer.setSuperclass(targetCls);
        // 设置enhancer的回调对象
        enhancer.setCallback(methodInterceptor);
        // 创建代理对象
        return (SubjectService) enhancer.create();
    }
}