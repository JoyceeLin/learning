/*
 *
 */
package learning.others.basic.generics;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/26 13:54
 * @Version V1.0
 */
public class GenericClassMethod<T> {

    public <T> void testMethod(T t) {
        System.out.println(t.getClass().getName());
    }

    public <T> T testMethod1(T t) {
        return t;
    }

    public static void main(String[] args) {
        GenericClassMethod<String> gcm = new GenericClassMethod<>();
        gcm.testMethod(1);
        gcm.testMethod1(1);
    }
}
