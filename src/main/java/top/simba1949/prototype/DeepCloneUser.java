package top.simba1949.prototype;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author anthony
 * @datetime 2023/7/16 14:01
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeepCloneUser implements Cloneable {

    private String username;
    private Integer age;
    private DeepCloneRole role;

    @Override
    public DeepCloneUser clone() {
        try {
            DeepCloneUser clone = (DeepCloneUser) super.clone();
            clone.setRole((DeepCloneRole) this.role.clone());
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}