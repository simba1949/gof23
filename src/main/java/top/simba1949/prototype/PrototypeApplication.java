package top.simba1949.prototype;

import com.alibaba.fastjson2.JSONObject;
import lombok.extern.slf4j.Slf4j;

/**
 * @author anthony
 * @datetime 2023/7/16 13:54
 */
@Slf4j
public class PrototypeApplication {

    public static void main(String[] args) {
        // 原型模式克隆
        // prototypeObj();

        // 直接复制
        // directCopy();

        // 浅克隆
        // shallowClone();

        // 深克隆
        // deepClone();

        // 通过序列化实现深度克隆
        deepCloneBySerializable();
    }

    /**
     * 通过序列化实现深度克隆
     */
    public static void deepCloneBySerializable() {
        DeepCloneRoleBySerializable role = DeepCloneRoleBySerializable.builder().roleName("RoleName-1").build();
        DeepCloneUserBySerializable user1 = DeepCloneUserBySerializable.builder().age(1).username("UserName-1").role(role).build();
        String user1JsonStr = JSONObject.toJSONString(user1);
        DeepCloneUserBySerializable user2 = JSONObject.parseObject(user1JsonStr, DeepCloneUserBySerializable.class);

        // user1 == user2 ? false
        log.info("user1 == user2 ? {}", user1 == user2);
        //  user1 is DeepCloneUserBySerializable(username=UserName-1, age=1, role=DeepCloneRoleBySerializable(roleName=RoleName-1))，
        //  user2 is DeepCloneUserBySerializable(username=UserName-1, age=1, role=DeepCloneRoleBySerializable(roleName=RoleName-1))
        log.info("user1 is {}，user2 is {}", user1, user2);

        user1.setAge(11);
        user1.setUsername("UserName-11");
        user1.getRole().setRoleName("RoleName-11");
        // user1 is DeepCloneUserBySerializable(username=UserName-11, age=11, role=DeepCloneRoleBySerializable(roleName=RoleName-11))，
        // user2 is DeepCloneUserBySerializable(username=UserName-1,  age=1,  role=DeepCloneRoleBySerializable(roleName=RoleName-1))
        log.info("user1 is {}，user2 is {}", user1, user2);

        user2.setAge(22);
        user2.setUsername("UserName-22");
        user2.getRole().setRoleName("RoleName-22");
        //  user1 is DeepCloneUserBySerializable(username=UserName-11, age=11, role=DeepCloneRoleBySerializable(roleName=RoleName-11))，
        //  user2 is DeepCloneUserBySerializable(username=UserName-22, age=22, role=DeepCloneRoleBySerializable(roleName=RoleName-22))
        log.info("user1 is {}，user2 is {}", user1, user2);
    }


    /**
     * 深度克隆
     * 1. 在引用对象里，实现Cloneable接口，重写clone方法；
     * 2. 在需要克隆的对象里，实现Cloneable接口，重写clone方法；clone方法中需要特殊处理；
     */
    public static void deepClone() {
        DeepCloneRole role = DeepCloneRole.builder().roleName("RoleName-1").build();
        DeepCloneUser user1 = DeepCloneUser.builder().age(1).username("UserName-1").role(role).build();
        DeepCloneUser user2 = (DeepCloneUser) user1.clone();

        // user1 == user2 ? false
        log.info("user1 == user2 ? {}", user1 == user2);
        // user1 is DeepCloneUser(username=UserName-1, age=1, role=DeepCloneRole(roleName=RoleName-1))，
        // user2 is DeepCloneUser(username=UserName-1, age=1, role=DeepCloneRole(roleName=RoleName-1))
        log.info("user1 is {}，user2 is {}", user1, user2);

        user1.setAge(11);
        user1.setUsername("UserName-11");
        user1.getRole().setRoleName("RoleName-11");
        // user1 is DeepCloneUser(username=UserName-11, age=11, role=DeepCloneRole(roleName=RoleName-11))，
        // user2 is DeepCloneUser(username=UserName-1,  age=1,  role=DeepCloneRole(roleName=RoleName-1))
        log.info("user1 is {}，user2 is {}", user1, user2);

        user2.setAge(22);
        user2.setUsername("UserName-22");
        user2.getRole().setRoleName("RoleName-22");
        // user1 is DeepCloneUser(username=UserName-11, age=11, role=DeepCloneRole(roleName=RoleName-11))，
        // user2 is DeepCloneUser(username=UserName-22, age=22, role=DeepCloneRole(roleName=RoleName-22))
        log.info("user1 is {}，user2 is {}", user1, user2);
    }

    /**
     * 创建一个新对象，然后将当前对象的非静态字段复制到该新对象，
     * * 如果字段是值类型的，那么对该字段执行复制；
     * * 如果该字段是引用类型的话，则复制引用但不复制引用的对象；
     * <p>
     * 在需要克隆的对象里，实现Cloneable接口，重写clone方法；
     */
    public static void shallowClone() {
        ShallowCloneRole role = ShallowCloneRole.builder().roleName("RoleName-1").build();
        ShallowCloneUser user1 = ShallowCloneUser.builder().age(1).username("UserName-1").role(role).build();
        ShallowCloneUser user2 = (ShallowCloneUser) user1.clone();


        // user1 == user2 ? false
        log.info("user1 == user2 ? {}", user1 == user2);
        // user1 is ShallowCloneUser(username=UserName-1, age=1, role=ShallowCloneRole(roleName=RoleName-1))，
        // user2 is ShallowCloneUser(username=UserName-1, age=1, role=ShallowCloneRole(roleName=RoleName-1))
        log.info("user1 is {}，user2 is {}", user1, user2);

        user1.setAge(11);
        user1.setUsername("UserName-11");
        user1.getRole().setRoleName("RoleName-11");
        // user1 is ShallowCloneUser(username=UserName-11, age=11, role=ShallowCloneRole(roleName=RoleName-11))，
        // user2 is ShallowCloneUser(username=UserName-1,  age=1,  role=ShallowCloneRole(roleName=RoleName-11))
        log.info("user1 is {}，user2 is {}", user1, user2);

        user2.setAge(22);
        user2.setUsername("UserName-22");
        user2.getRole().setRoleName("RoleName-22");
        // user1 is ShallowCloneUser(username=UserName-11, age=11, role=ShallowCloneRole(roleName=RoleName-22))，
        // user2 is ShallowCloneUser(username=UserName-22, age=22, role=ShallowCloneRole(roleName=RoleName-22))
        log.info("user1 is {}，user2 is {}", user1, user2);
    }


    /**
     * 实际上复制的是对象的引用，任何一个实例的数据变动都会引起另外一个实例的数据变动
     */
    public static void directCopy() {
        User user1 = User.builder().age(1).username("UserName-1").build();
        User user2 = user1;

        // user1 == user2 ? true
        log.info("user1 == user2 ? {}", user1 == user2);
        // user1 is User(username=UserName-1, age=1)，
        // user2 is User(username=UserName-1, age=1)
        log.info("user1 is {}，user2 is {}", user1, user2);

        user1.setAge(11);
        // user1 is User(username=UserName-1, age=11)，
        // user2 is User(username=UserName-1, age=11)
        log.info("user1 is {}，user2 is {}", user1, user2);

        user2.setAge(22);
        // user1 is User(username=UserName-1, age=22)，
        // user2 is User(username=UserName-1, age=22)
        log.info("user1 is {}，user2 is {}", user1, user2);
    }

    /**
     * clone 对象
     */
    public static void prototypeObj() {
        PrototypeObj prototypeObj = new PrototypeObj();
        // 克隆后的新对象地址值和原对象地址值不同
        PrototypeObj clone = prototypeObj.clone();
        // 原型 == 克隆 结果：false
        log.info("原型 == 克隆 结果：{}", prototypeObj == clone);
    }
}