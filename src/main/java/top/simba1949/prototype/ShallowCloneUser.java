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
public class ShallowCloneUser implements Cloneable {

    private String username;
    private Integer age;
    private ShallowCloneRole role;

    @Override
    public ShallowCloneUser clone() {
        try {
            return (ShallowCloneUser) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}