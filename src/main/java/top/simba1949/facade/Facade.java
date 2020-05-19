package top.simba1949.facade;

/**
 * @Author Theodore
 * @Date 2020/5/19 10:07
 */
public class Facade {

    private System00 system00 = new System00();
    private System01 system01 = new System01();

    public void system00Method(){
        system00.print();
    }

    public void system01Method(){
        system01.sayHello();
    }
}
