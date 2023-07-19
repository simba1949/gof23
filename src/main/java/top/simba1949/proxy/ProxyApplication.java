package top.simba1949.proxy;

import javassist.util.proxy.ProxyFactory;
import javassist.util.proxy.ProxyObject;
import lombok.extern.slf4j.Slf4j;
import net.sf.cglib.proxy.Enhancer;
import top.simba1949.proxy.cglib.CglibMethodInterceptor;
import top.simba1949.proxy.cglib.CglibProxyFactory;
import top.simba1949.proxy.cglib.SubjectService;
import top.simba1949.proxy.javassist.JavassistMethodHandler;
import top.simba1949.proxy.javassist.JavassistProxyFactory;
import top.simba1949.proxy.javassist.JavassistSubjectService;
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

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        // 静态代理
        // staticState();

        // jdk 动态代理
        // jdkProxy();

        // cjlib动态代理
        // cglibProxy();

        // cjlib动态代理，通过代理工厂代理
        // cglibProxyByFactory();

        // javassist 动态代理
        // javassistProxy();

        // javassist 动态代理，通过代理工厂代理
        javassistProxyByFactory();
    }

    /**
     * javassist 动态代理，通过代理工厂代理
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public static void javassistProxyByFactory() throws InstantiationException, IllegalAccessException {
        JavassistSubjectService proxy = JavassistProxyFactory.getProxy(JavassistSubjectService.class, new JavassistMethodHandler());
        // 执行代理方法
        String result = proxy.doSomething();
        log.info("result is {}", result);
    }

    /**
     * javassist 动态代理
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public static void javassistProxy() throws InstantiationException, IllegalAccessException {
        // 创建代理工厂
        ProxyFactory proxyFactory = new ProxyFactory();
        // 设置代理类的父类，也是被代理类
        proxyFactory.setSuperclass(JavassistSubjectService.class);
        // 生成动态代理类
        Class<?> aClass = proxyFactory.createClass();
        // 创建动态代理类的实例
        Object proxyInstance = aClass.newInstance();
        // 设置动态处理方式
        JavassistMethodHandler javassistMethodHandler = new JavassistMethodHandler();
        ((ProxyObject)proxyInstance).setHandler(javassistMethodHandler);
        // 执行代理方法
        String result = ((SubjectService) proxyInstance).doSomething();
        log.info("result is {}", result);
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

    /**
     * jdk动态代理
     */
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
