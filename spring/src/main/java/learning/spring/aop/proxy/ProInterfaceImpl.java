
package learning.spring.aop.proxy;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/4/7 10:38
 * @Version V1.0
 */
public class ProInterfaceImpl implements ProInterface {
    @Override
    public void test() {
        System.out.println("invoke ProInterfaceImpl.test()");
    }
}
