
package learning.spring.aop.test;

import java.lang.annotation.*;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/2/26 14:52
 * @Version V1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface TestAnno {
    String key();
}
