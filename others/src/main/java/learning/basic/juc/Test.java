/*
 *
 */
package learning.basic.juc;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/7/12 18:42
 * @Version V1.0
 */
public class Test {
    static int i = 1;
    static {
        i = 0;                // 给变量赋值可以正常编译通过
        System.out.print(i);  // 这句编译器会提示“非法向前引用”
    }
}
