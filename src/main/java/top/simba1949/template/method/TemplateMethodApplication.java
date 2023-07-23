package top.simba1949.template.method;

/**
 * @author anthony
 * @datetime 2023/7/23 12:00
 */
public class TemplateMethodApplication {

    public static void main(String[] args) {
        AbstractClass baoCaiConcreteClass = new BaoCaiConcreteClass();
        baoCaiConcreteClass.cookProcess();
    }
}