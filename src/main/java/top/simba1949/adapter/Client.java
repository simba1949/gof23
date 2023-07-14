package top.simba1949.adapter;

/**
 * @author anthony
 * @datetime 2020/5/19 11:37
 */
public class Client {
    private ObjectAdapter objectAdapter;

    public Client(ObjectAdapter objectAdapter) {
        this.objectAdapter = objectAdapter;
    }

    public void request(){
        objectAdapter.request();
    }
}
