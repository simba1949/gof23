package top.simba1949.prototype;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author anthony
 * @datetime 2023/7/16 14:02
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeepCloneRoleBySerializable implements Serializable {
    private static final long serialVersionUID = -4926861047778163967L;

    private String roleName;
}