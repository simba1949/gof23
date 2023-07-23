package top.simba1949.mediator;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/23 22:31
 */
@Slf4j
@Data
public class MediatorStructure extends AbsMediator {

    private HouseOwner houseOwner;
    private Tenant tenant;

    @Override
    public void contact(String message, Person person) {
        if (person instanceof HouseOwner) {
            tenant.getMessage(message);
        }

        if (person instanceof Tenant) {
            houseOwner.getMessage(message);
        }
    }
}