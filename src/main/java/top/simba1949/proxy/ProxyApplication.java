package top.simba1949.proxy;

import lombok.extern.slf4j.Slf4j;
import net.sf.cglib.proxy.Enhancer;
import top.simba1949.proxy.cglib.CglibMethodInterceptor;
import top.simba1949.proxy.cglib.CglibProxyFactory;
import top.simba1949.proxy.cglib.SubjectService;
import top.simba1949.proxy.jdk.JdkInvocationHandler;
import top.simba1949.proxy.jdk.RealSubject;
import top.simba1949.proxy.jdk.Subject;
import top.simba1949.proxy.staticState.ProxyTrainStation;

/**
 * @author anthony
 * @datetime 2023/7/19 22:33
 */
@Slf4j
public class ProxyApplication {
    public static void main(String[] args) {
        // 静态代理
        // staticState();

        // jdk 动态代理
        // jdkProxy();

        // cjlib动态代理
        // cglibProxy();

        // cjlib动态代理，通过代理工厂代理
        cglibProxyByFactory();
    }



    /**
     * cglib 动态代理，通过代理工厂代理
     */
    public static void cglibProxyByFactory() {
        // 使用代理工厂
        SubjectService proxy = CglibProxyFactory.getProxyObj(SubjectService.class, new CglibMethodInterceptor());
        // 通过代理对象调用目标方法
        String result = proxy.doSomething();
        log.info("result is {}", result);
    }

    /**
     * cglib 动态代理
     */
    public static void cglibProxy() {
        // 通过CGLIB动态代理获取代理对象的过程
        Enhancer enhancer = new Enhancer();
        // 设置enhancer对象的父类
        enhancer.setSuperclass(SubjectService.class);
        // 设置enhancer的回调对象
        enhancer.setCallback(new CglibMethodInterceptor());
        // 创建代理对象
        SubjectService proxy = (SubjectService)enhancer.create();
        // 通过代理对象调用目标方法
        String result = proxy.doSomething();
        log.info("result is {}", result);
    }


    public static void jdkProxy() {
        // realSubject 被代理的类
        RealSubject realSubject = new RealSubject();
        Subject proxy = new JdkInvocationHandler(realSubject).getProxy();
        proxy.doSomething();
    }

    /**
     * 静态代理
     * ProxyTrainStation 代理了 TrainStation 类对象，
     * ProxyTrainStation 作为访问对象和目标对象的中介，也对 sell 方法进行了增强
     */
    public static void staticState() {
        ProxyTrainStation proxyTrainStation = new ProxyTrainStation();
        proxyTrainStation.sell();
    }
}
