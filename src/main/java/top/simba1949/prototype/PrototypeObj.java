package top.simba1949.prototype;

/**
 * @author anthony
 * @datetime 2023/7/15 22:27
 */
public class PrototypeObj implements Cloneable {

    @Override
    public PrototypeObj clone() {
        try {
            return (PrototypeObj) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}