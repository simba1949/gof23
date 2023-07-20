package top.simba1949.adapter;

/**
 * @author anthony
 * @datetime 2023/7/20 22:13
 */
public interface SDCard {

    /**
     * 读 SD
     *
     * @return
     */
    String readSD();

    /**
     * 写 SD
     *
     * @param msg
     */
    void writeSD(String msg);
}