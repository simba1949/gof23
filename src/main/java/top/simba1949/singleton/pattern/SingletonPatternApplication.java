package top.simba1949.singleton.pattern;

import cn.hutool.core.collection.ConcurrentHashSet;
import cn.hutool.core.lang.Assert;
import lombok.extern.slf4j.Slf4j;
import top.simba1949.singleton.pattern.impl.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.CountDownLatch;

/**
 * @author anthony
 * @datetime 2023/7/14
 */
@Slf4j
public class SingletonPatternApplication {

    public static void main(String[] args) throws Exception {
        // 饿汉式——静态常量
        // hungrySingletonByStaticConstant();

        // 饿汉式——静态代码块
        // hungrySingletonByStaticCodeBlock();

        // 懒汉式——普通懒汉式
        // lazySingletonByCommon();

        // 懒汉式——同步方法
        // lazySingletonBySyncMethod();

        // 懒汉式——同步代码块
        // lazySingletonBySyncCode();

        // 双重检测锁
        // singletonByDoubleCheckSync();

        // 静态内部类
        // singletonByStaticInnerClass();

        // 枚举单例
         singletonByEnum();

        // 防止反射破坏单例
        // singletonByReflect();

        // 防止反序列化破坏单例
        // singletonBySerializable();

        // 防止 clone 破坏单例
        // singletonByClone();
    }

    /**
     * 饿汉式——静态常量
     *
     * @throws Exception
     */
    public static void hungrySingletonByStaticConstant() throws Exception {
        ConcurrentHashSet<HungrySingletonByStaticConstant> container = new ConcurrentHashSet<>();
        CountDownLatch countDownLatch = new CountDownLatch(1000);

        // 连续获取对象，如果相等说明是同一个对象
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                public void run() {
                    HungrySingletonByStaticConstant instance = HungrySingletonByStaticConstant.getInstance();
                    log.info("获取实例的hashCode值为：{}", instance.hashCode());
                    container.add(instance);
                    countDownLatch.countDown();
                }
            }).start();
        }

        // 等待所有线程执行完成
        countDownLatch.await();

        Assert.isTrue(1 == container.size(), "容器内对象不是同一个对象");
    }

    /**
     * 饿汉式——静态代码块
     *
     * @throws Exception
     */
    public static void hungrySingletonByStaticCodeBlock() throws Exception {
        ConcurrentHashSet<HungrySingletonByStaticCodeBlock> container = new ConcurrentHashSet<>();
        CountDownLatch countDownLatch = new CountDownLatch(1000);

        // 连续获取对象，如果相等说明是同一个对象
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                public void run() {
                    HungrySingletonByStaticCodeBlock instance = HungrySingletonByStaticCodeBlock.getInstance();
                    log.info("获取实例的hashCode值为：{}", instance.hashCode());
                    container.add(instance);
                    countDownLatch.countDown();
                }
            }).start();
        }

        // 等待所有线程执行完成
        countDownLatch.await();

        Assert.isTrue(1 == container.size(), "容器内对象不是同一个对象");
    }

    /**
     * 懒汉式——普通懒汉式
     * @throws Exception
     */
    public static void lazySingletonByCommon() throws Exception {
        ConcurrentHashSet<LazySingletonByCommon> container = new ConcurrentHashSet<>();
        CountDownLatch countDownLatch = new CountDownLatch(1000);

        // 连续获取对象，如果相等说明是同一个对象
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                public void run() {
                    LazySingletonByCommon instance = LazySingletonByCommon.getInstance();
                    log.info("获取实例的hashCode值为：{}", instance.hashCode());
                    container.add(instance);
                    countDownLatch.countDown();
                }
            }).start();
        }

        // 等待所有线程执行完成
        countDownLatch.await();

        Assert.isTrue(1 == container.size(), "容器内对象不是同一个对象");
    }

    /**
     * 懒汉式——同步方法
     * @throws Exception
     */
    public static void lazySingletonBySyncMethod() throws Exception {
        ConcurrentHashSet<LazySingletonBySyncMethod> container = new ConcurrentHashSet<>();
        CountDownLatch countDownLatch = new CountDownLatch(1000);

        // 连续获取对象，如果相等说明是同一个对象
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                public void run() {
                    LazySingletonBySyncMethod instance = LazySingletonBySyncMethod.getInstance();
                    log.info("获取实例的hashCode值为：{}", instance.hashCode());
                    container.add(instance);
                    countDownLatch.countDown();
                }
            }).start();
        }

        // 等待所有线程执行完成
        countDownLatch.await();

        Assert.isTrue(1 == container.size(), "容器内对象不是同一个对象");
    }

    /**
     * 懒汉式——同步代码块
     * @throws Exception
     */
    public static void lazySingletonBySyncCode() throws Exception {
        ConcurrentHashSet<LazySingletonBySyncCode> container = new ConcurrentHashSet<>();
        CountDownLatch countDownLatch = new CountDownLatch(1000);

        // 连续获取对象，如果相等说明是同一个对象
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                public void run() {
                    LazySingletonBySyncCode instance = LazySingletonBySyncCode.getInstance();
                    log.info("获取实例的hashCode值为：{}", instance.hashCode());
                    container.add(instance);
                    countDownLatch.countDown();
                }
            }).start();
        }

        // 等待所有线程执行完成
        countDownLatch.await();

        Assert.isTrue(1 == container.size(), "容器内对象不是同一个对象");
    }

    /**
     * 双重检查
     * @throws Exception
     */
    public static void SingletonByDoubleCheckSync() throws Exception {
        ConcurrentHashSet<SingletonByDoubleCheckSync> container = new ConcurrentHashSet<>();
        CountDownLatch countDownLatch = new CountDownLatch(1000);

        // 连续获取对象，如果相等说明是同一个对象
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                public void run() {
                    SingletonByDoubleCheckSync instance = SingletonByDoubleCheckSync.getInstance();
                    log.info("获取实例的hashCode值为：{}", instance.hashCode());
                    container.add(instance);
                    countDownLatch.countDown();
                }
            }).start();
        }

        // 等待所有线程执行完成
        countDownLatch.await();

        Assert.isTrue(1 == container.size(), "容器内对象不是同一个对象");
    }

    /**
     * 静态内部类
     * @throws Exception
     */
    public static void singletonByStaticInnerClass() throws Exception {
        ConcurrentHashSet<SingletonByStaticInnerClass> container = new ConcurrentHashSet<>();
        CountDownLatch countDownLatch = new CountDownLatch(1000);

        // 连续获取对象，如果相等说明是同一个对象
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                public void run() {
                    SingletonByStaticInnerClass instance = SingletonByStaticInnerClass.getInstance();
                    log.info("获取实例的hashCode值为：{}", instance.hashCode());
                    container.add(instance);
                    countDownLatch.countDown();
                }
            }).start();
        }

        // 等待所有线程执行完成
        countDownLatch.await();

        Assert.isTrue(1 == container.size(), "容器内对象不是同一个对象");
    }

    /**
     * 枚举单例
     * @throws Exception
     */
    public static void singletonByEnum() throws Exception {
        ConcurrentHashSet<SingletonByEnum> container = new ConcurrentHashSet<>();
        CountDownLatch countDownLatch = new CountDownLatch(1000);

        // 连续获取对象，如果相等说明是同一个对象
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                public void run() {
                    SingletonByEnum instance = SingletonByEnum.getInstance();
                    log.info("获取实例的hashCode值为：{}", instance.hashCode());
                    container.add(instance);
                    countDownLatch.countDown();
                }
            }).start();
        }

        // 等待所有线程执行完成
        countDownLatch.await();

        Assert.isTrue(1 == container.size(), "容器内对象不是同一个对象");
    }

    /**
     * 通过反射获取实例
     * @throws Exception
     */
    public static void singletonByReflect() throws Exception {
        ConcurrentHashSet<SingletonByReflect> container = new ConcurrentHashSet<>();
        CountDownLatch countDownLatch = new CountDownLatch(1000);

        // 连续获取对象，如果相等说明是同一个对象
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        // 通过反射获取实例
                        SingletonByReflect instance = SingletonByReflect.class.newInstance();
                        log.info("获取实例的hashCode值为：{}", instance.hashCode());
                        container.add(instance);
                    } catch (Exception e) {
                        log.info("获取到异常，异常信息为{}", e.getMessage(), e);
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }

        // 等待所有线程执行完成
        countDownLatch.await();
        // 这里因为代码中是饿汉式（静态常量）模式，实例已经存在了，在通过反序列化后会一直报异常
        Assert.isTrue(1 >= container.size(), "容器内对象不是同一个对象");
    }

    /**
     * 通过反射获取实例
     * @throws Exception
     */
    public static void singletonBySerializable() throws Exception {
        String path = "d:\\SingletonBySerializable.txt";

        // 获取对象
        SingletonBySerializable instance4Serializable = SingletonBySerializable.getInstance();
        // 先将对象进行序列化
        ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(new File(path).toPath()));
        oos.writeObject(instance4Serializable);


        ConcurrentHashSet<SingletonBySerializable> container = new ConcurrentHashSet<>();
        CountDownLatch countDownLatch = new CountDownLatch(1000);

        // 连续获取对象，如果相等说明是同一个对象
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        // 通过反序列化获取对象
                        ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get(path)));
                        SingletonBySerializable instance = (SingletonBySerializable)ois.readObject();
                        log.info("获取实例的hashCode值为：{}", instance.hashCode());
                        container.add(instance);
                    } catch (Exception e) {
                        log.info("获取到异常，异常信息为{}", e.getMessage(), e);
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }

        // 等待所有线程执行完成
        countDownLatch.await();
        // 这里因为代码中是饿汉式（静态常量）模式，实例已经存在了，在通过反序列化后会一直报异常
        Assert.isTrue(1 >= container.size(), "容器内对象不是同一个对象");
    }

    /**
     * 通过反射获取实例
     * @throws Exception
     */
    public static void singletonByClone() throws Exception {
        // 获取对象
        SingletonByClone instance4Original = SingletonByClone.getInstance();

        ConcurrentHashSet<SingletonByClone> container = new ConcurrentHashSet<>();
        CountDownLatch countDownLatch = new CountDownLatch(1000);

        // 连续获取对象，如果相等说明是同一个对象
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        // 通过反序列化获取对象
                        SingletonByClone clone = (SingletonByClone) instance4Original.clone();
                        log.info("获取实例的hashCode值为：{}", clone.hashCode());
                        container.add(clone);
                    } catch (Exception e) {
                        log.info("获取到异常，异常信息为{}", e.getMessage(), e);
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }

        // 等待所有线程执行完成
        countDownLatch.await();
        // 这里因为代码中是饿汉式（静态常量）模式，实例已经存在了，在通过反序列化后会一直报异常
        Assert.isTrue(1 >= container.size(), "容器内对象不是同一个对象");
    }
}
