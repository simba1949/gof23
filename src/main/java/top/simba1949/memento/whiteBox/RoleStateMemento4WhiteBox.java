package top.simba1949.memento.whiteBox;

import lombok.Data;

/**
 * @author anthony
 * @datetime 2023/7/24 22:30
 */
@Data
public class RoleStateMemento4WhiteBox {

    private int vit;
    private int atk;
    private int def;

    public RoleStateMemento4WhiteBox(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }
}