package top.simba1949.adapter;

/**
 * @author anthony
 * @datetime 2023/7/20 22:10
 */
public interface TFCard {

    /**
     * 读 TF
     *
     * @return
     */
    String readTF();

    /**
     * 写 TF
     *
     * @param msg
     */
    void writeTF(String msg);
}