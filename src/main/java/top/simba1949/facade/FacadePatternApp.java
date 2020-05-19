package top.simba1949.facade;

/**
 * 此类作为客户端去访问具体的方法
 * @Author Theodore
 * @Date 2020/5/19 10:03
 */
public class FacadePatternApp {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.system00Method();
        facade.system01Method();
    }
}
