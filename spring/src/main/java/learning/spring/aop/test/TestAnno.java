/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
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
