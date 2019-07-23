/*
 *
 */
package learning.basic.generics;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/26 13:56
 * @Version V1.0
 */
public interface Comparable<T> {
    int compareTo(T o);
    boolean equals(Object obj);
}
