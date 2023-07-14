package top.simba1949.adapter;

/**
 * @author anthony
 * @datetime 2020/5/19 11:05
 */
public class ObjectAdapter implements Target {

    private Adaptor adaptor;

    public ObjectAdapter(Adaptor adaptor) {
        this.adaptor = adaptor;
    }

    @Override
    public void request() {
        adaptor.specificRequest();
    }
}
