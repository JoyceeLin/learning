/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.generics;

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
