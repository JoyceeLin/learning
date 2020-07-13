
package learning.java8.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/1/6 19:18
 * @Version V1.0
 */
@Data
@AllArgsConstructor
public class Test {

    public String test2(String a) {
        System.out.println(a);
        return "aa";
    }
}
