/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.framework.spring.aop;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/14 12:11
 * @Version V1.0
 */
public class DLogger implements ILogger {

    @Override
    public void start(Method method) {
        System.out.println(new Date() + method.getName() + " start!");
    }

    @Override
    public void end(Method method) {
        System.out.println(new Date() + method.getName() + " end!");
    }
}
