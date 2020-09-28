package learning.guava.collections;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/9/27 11:40
 * @Version V1.0
 */
public class MultisetTest {

    public static void main(String[] args) {
        Multiset<Integer> multiset = HashMultiset.create();
        multiset.add(1);
        multiset.add(1, 2);
        System.out.println(multiset.count(1));
    }
}
