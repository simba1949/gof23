package top.simba1949.mediator;

/**
 * @author anthony
 * @datetime 2023/7/23 22:48
 */
public class MediatorApplication {

    public static void main(String[] args) {
        // 创建中介者
        MediatorStructure mediatorStructure = new MediatorStructure();
        // 创建房东
        HouseOwner houseOwner = new HouseOwner("房东", mediatorStructure);
        // 创建租客
        Tenant tenant = new Tenant("租客", mediatorStructure);

        // 中介知道房东和租客
        mediatorStructure.setHouseOwner(houseOwner);
        mediatorStructure.setTenant(tenant);

        tenant.contact("我要租房");
        houseOwner.contact("我有房子可以出租");
    }
}