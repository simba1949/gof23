package top.simba1949.composite;

/**
 * @author anthony
 * @datetime 2023/7/22 16:43
 */
public class CompositeApplication {

    public static void main(String[] args) {
        MenuComponent root = createMenuTree();

        root.print();
    }

    /**
     * <p>
     * 系统菜单
     * ————菜单管理
     * ————|————展开菜单
     * ————|————页面访问
     * ————|————新增菜单
     * ————|————删除菜单
     * ————|————编辑菜单
     * ————权限管理
     * ————|————页面访问
     * ————|————提交保存
     * ————角色管理
     * ————|————页面访问
     * ————|————新增角色
     * ————|————修改角色
     * </p>
     *
     * @return
     */
    public static MenuComponent createMenuTree() {
        Menu root = new Menu("系统菜单", 1);

        Menu menuMgr = new Menu("菜单管理", 2);
        MenuItem menuMgrExpand = new MenuItem("展开菜单", 3);
        MenuItem menuMgrPage = new MenuItem("页面访问", 3);
        MenuItem menuMgrAdd = new MenuItem("新增菜单", 3);
        MenuItem menuMgrDel = new MenuItem("删除菜单", 3);
        MenuItem menuMgrEdit = new MenuItem("编辑菜单", 3);
        menuMgr.add(menuMgrExpand);
        menuMgr.add(menuMgrPage);
        menuMgr.add(menuMgrAdd);
        menuMgr.add(menuMgrDel);
        menuMgr.add(menuMgrEdit);


        Menu permissionMgr = new Menu("权限管理", 2);
        MenuItem permissionMgrPage = new MenuItem("页面访问", 3);
        MenuItem permissionMgrSave = new MenuItem("提交保存", 3);
        permissionMgr.add(permissionMgrPage);
        permissionMgr.add(permissionMgrSave);


        Menu roleMgr = new Menu("角色管理", 2);
        MenuItem roleMgrPage = new MenuItem("页面访问", 3);
        MenuItem roleMgrAdd = new MenuItem("新增角色", 3);
        MenuItem roleMgrUpdate = new MenuItem("修改角色", 3);
        roleMgr.add(roleMgrPage);
        roleMgr.add(roleMgrAdd);
        roleMgr.add(roleMgrUpdate);


        root.add(menuMgr);
        root.add(permissionMgr);
        root.add(roleMgr);

        return root;
    }
}