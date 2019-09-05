/*
 *
 */
package learning.others.basic.generics;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/26 13:50
 * @Version V1.0
 */
public class GenericMethod {

    public static <T> int indexOf(T[] arr, T ele) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(ele)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(indexOf(new java.lang.Integer[]{1, 2, 3}, 1));
        System.out.println(indexOf(new String[]{"1", "2", "3"}, "1"));
    }
}
