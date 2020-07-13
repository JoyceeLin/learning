
package learning.spring.aop.proxy;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/4/7 10:39
 * @Version V1.0
 */
public class ProInterfaceImplProxy implements ProInterface {

    private ProInterface proInterface;

    public ProInterfaceImplProxy(ProInterface proInterface) {
        this.proInterface = proInterface;
    }

    @Override
    public void test() {
        System.out.println("invoke ProInterfaceImplProxy.test()");
        proInterface.test();
    }
}
