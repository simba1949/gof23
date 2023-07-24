package top.simba1949.memento;

import lombok.extern.slf4j.Slf4j;
import top.simba1949.memento.blackBox.GameRole4BlackBox;
import top.simba1949.memento.blackBox.Memento4BlackBox;
import top.simba1949.memento.blackBox.RoleStateCaretaker4BlackBox;
import top.simba1949.memento.whiteBox.GameRole4WhiteBox;
import top.simba1949.memento.whiteBox.RoleStateCaretaker4WhiteBox;
import top.simba1949.memento.whiteBox.RoleStateMemento4WhiteBox;

/**
 * @author anthony
 * @datetime 2023/7/24 22:28
 */
@Slf4j
public class MementoApplication {
    public static void main(String[] args) {
        // 白盒备忘录
        // whiteBoxMemento();

        // 黑盒备忘录
        blackBoxMemento();
    }

    /**
     * 黑盒备忘录
     */
    public static void blackBoxMemento(){
        // 创建游戏管理者
        RoleStateCaretaker4BlackBox roleStateCaretaker = new RoleStateCaretaker4BlackBox();

        // 首先创建一个游戏角色
        GameRole4BlackBox gameRole = new GameRole4BlackBox();
        // 初始化游戏角色状态
        gameRole.initState();
        log.info("初始化后：游戏角色状态：{}", gameRole);

        // 游戏角色进行存档
        Memento4BlackBox roleStateMemento = gameRole.saveSate();
        // 将游戏角色交给管理者进行存档
        roleStateCaretaker.setMemento4BlackBox(roleStateMemento);
        log.info("存档后：游戏角色状态：{}", gameRole);

        // 游戏角色进行战斗
        gameRole.fight();
        log.info("战斗后：游戏角色状态：{}", gameRole);

        // 从管理者中获取存档
        Memento4BlackBox roleStateMemento1 = roleStateCaretaker.getMemento4BlackBox();
        // 从存档中恢复游戏角色状态
        gameRole.recoverState(roleStateMemento1);
        log.info("读档后：游戏角色状态：{}", gameRole);
    }

    /**
     * 白盒备忘录
     */
    public static void whiteBoxMemento(){
        // 创建游戏管理者
        RoleStateCaretaker4WhiteBox roleStateCaretaker4WhiteBox = new RoleStateCaretaker4WhiteBox();

        // 首先创建一个游戏角色
        GameRole4WhiteBox gameRole4WhiteBox = new GameRole4WhiteBox();
        // 初始化游戏角色状态
        gameRole4WhiteBox.initState();
        log.info("初始化后：游戏角色状态：{}", gameRole4WhiteBox);

        // 游戏角色进行存档
        RoleStateMemento4WhiteBox roleStateMemento4WhiteBox = gameRole4WhiteBox.saveSate();
        // 将游戏角色交给管理者进行存档
        roleStateCaretaker4WhiteBox.setRoleStateMemento4WhiteBox(roleStateMemento4WhiteBox);
        log.info("存档后：游戏角色状态：{}", gameRole4WhiteBox);

        // 游戏角色进行战斗
        gameRole4WhiteBox.fight();
        log.info("战斗后：游戏角色状态：{}", gameRole4WhiteBox);

        // 从管理者中获取存档
        RoleStateMemento4WhiteBox roleStateMemento4WhiteBox1 = roleStateCaretaker4WhiteBox.getRoleStateMemento4WhiteBox();
        // 从存档中恢复游戏角色状态
        gameRole4WhiteBox.recoverState(roleStateMemento4WhiteBox1);
        log.info("读档后：游戏角色状态：{}", gameRole4WhiteBox);
    }
}
