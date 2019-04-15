/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.aop;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/14 12:09
 * @Version V1.0
 */
public class Hello implements IHello {
    @Override
    public void sayHello(String str) {
        System.out.println(str);
    }
}
