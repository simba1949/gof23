package top.simba1949.prototype;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author anthony
 * @datetime 2023/7/16 14:01
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeepCloneUserBySerializable implements Serializable {
    private static final long serialVersionUID = -5688581631355776412L;

    private String username;
    private Integer age;
    private DeepCloneRoleBySerializable role;
}