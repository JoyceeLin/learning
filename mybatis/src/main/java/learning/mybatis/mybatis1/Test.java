/*

 */
package learning.mybatis.mybatis1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/7/23 11:07
 * @Version V1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Test {

    private Integer id;
    private String name;
}
