/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.aop;

import java.lang.reflect.Method;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/14 12:10
 * @Version V1.0
 */
public interface ILogger {

    void start(Method method);
    void end(Method method);
}
