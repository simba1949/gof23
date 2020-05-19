package top.simba1949.adapter;

/**
 * @Author Theodore
 * @Date 2020/5/18 17:56
 */
public class AdapterModeApp {
    public static void main(String[] args) {
        Adaptor adaptor = new Adaptor();
        ObjectAdapter objectAdapter = new ObjectAdapter(adaptor);

        Client client = new Client(objectAdapter);
        client.request();
    }
}
