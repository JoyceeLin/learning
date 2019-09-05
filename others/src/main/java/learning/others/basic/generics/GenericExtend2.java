/*
 *
 */
package learning.others.basic.generics;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/26 14:09
 * @Version V1.0
 */
public class GenericExtend2 {

    public static <T extends Comparable> T getMax(T[] arr) {
        T max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }

    public static <T extends Comparable<T>> T getMax2(T[] arr) {
        T max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }
}
