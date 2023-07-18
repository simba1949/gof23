package top.simba1949.prototype;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author anthony
 * @datetime 2023/7/16 14:02
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeepCloneRole implements Cloneable {
    private String roleName;

    @Override
    public DeepCloneRole clone() {
        try {
            return (DeepCloneRole) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}