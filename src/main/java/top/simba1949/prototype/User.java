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
public class User {

    private String username;
    private Integer age;
}