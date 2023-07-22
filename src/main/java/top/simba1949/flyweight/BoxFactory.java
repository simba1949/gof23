package top.simba1949.flyweight;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author anthony
 * @datetime 2023/7/22 20:39
 */
public class BoxFactory {

    private static final BoxFactory INSTANCE = new BoxFactory();

    private ConcurrentHashMap<String, AbstractBox> map = new ConcurrentHashMap<>();

    private BoxFactory() {
    }

    public static BoxFactory getInstance() {
        return INSTANCE;
    }

    /**
     * 获取图形
     *
     * @param shapeName
     * @return
     */
    public AbstractBox getShape(String shapeName) {
        if (!map.containsKey(shapeName)) {
            switch (shapeName) {
                case "I": {
                    map.put("I", new IBox());
                    break;
                }
                case "L": {
                    map.put("L", new LBox());
                    break;
                }
                case "T": {
                    map.put("T", new TBox());
                    break;
                }
                default: {

                }
            }
        }

        return map.get(shapeName);
    }
}