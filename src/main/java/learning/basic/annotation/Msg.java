/*
 *
 */
package learning.basic.annotation;

import java.lang.annotation.*;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/13 17:48
 * @Version V1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Msg {
    String DEFAULT_MSG = "msg";

    String msg() default DEFAULT_MSG;
}
