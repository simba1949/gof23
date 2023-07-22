package top.simba1949.facade;

/**
 * 此类作为客户端去访问具体的方法
 *
 * @author anthony
 * @datetime 2020/5/19 10:03
 */
public class FacadeApplication {

    public static void main(String[] args) {
        SmartSpeakerFacade smartSpeakerFacade = new SmartSpeakerFacade();
        smartSpeakerFacade.sayMessage("off");
    }
}