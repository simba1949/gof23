package top.simba1949.factory.simple;

/**
 * @Author Theodore
 * @Date 2020/5/9 11:45
 */
public abstract class Pizza {

    protected String name;

    /**
     * 准备原材料，每种 Pizza 原材料不一致
     */
    public abstract void prepare();

    /**
     * Pizza 烘烤
     */
    public void bake(){
        System.out.println(name + " : baking");
    }

    /**
     * Pizza 切割
     */
    public void cut(){
        System.out.println(name + " : cutting");
    }

    /**
     * Pizza 打包
     */
    public void box(){
        System.out.println(name + " : boxing");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
            "name='" + name + '\'' +
            '}';
    }
}