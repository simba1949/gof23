package top.simba1949.memento.blackBox;

import lombok.Data;

/**
 * @author anthony
 * @datetime 2023/7/24 22:29
 */
@Data
public class GameRole4BlackBox {

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
    public Memento4BlackBox saveSate() {
        return new RoleStateMemento4BlackBox(vit, atk, def);
    }

    /**
     * 读档
     *
     * @param memento4BlackBox
     */
    public void recoverState(Memento4BlackBox memento4BlackBox) {
        RoleStateMemento4BlackBox roleStateMemento = (RoleStateMemento4BlackBox) memento4BlackBox;
        this.vit = roleStateMemento.getVit();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
    }

    /**
     * 将备忘录角色设置为发起角色的内部类
     */
    @Data
    private class RoleStateMemento4BlackBox implements Memento4BlackBox {
        private int vit;
        private int atk;
        private int def;

        public RoleStateMemento4BlackBox() {
        }

        public RoleStateMemento4BlackBox(int vit, int atk, int def) {
            this.vit = vit;
            this.atk = atk;
            this.def = def;
        }
    }
}