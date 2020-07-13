
package learning.jdk;

import java.util.HashMap;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/10 14:52
 * @Version V1.0
 */
public class HashMapTest {

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>(2, 1);
        map.put(3, 3);
        map.put(7, 7);
        map.put(5, 5);
    }
}
