package top.simba1949.memento.whiteBox;

import lombok.Data;

/**
 * @author anthony
 * @datetime 2023/7/24 22:29
 */
@Data
public class GameRole4WhiteBox {

    private int vit;
    private int atk;
    private int def;

    /**
     * 初始状态
     */
    public void initState() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    /**
     * 战斗
     */
    public void fight() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    /**
     * 存档
     *
     * @return
     */
    public RoleStateMemento4WhiteBox saveSate() {
        return new RoleStateMemento4WhiteBox(vit, atk, def);
    }

    /**
     * 读档
     *
     * @param memento
     */
    public void recoverState(RoleStateMemento4WhiteBox memento) {
        this.vit = memento.getVit();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }
}