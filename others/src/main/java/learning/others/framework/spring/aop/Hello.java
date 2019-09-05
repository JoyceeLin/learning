/*
 *
 */
package learning.others.framework.spring.aop;

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
