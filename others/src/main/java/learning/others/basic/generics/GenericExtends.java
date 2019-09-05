/*
 *
 */
package learning.others.basic.generics;


/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/26 13:58
 * @Version V1.0
 */
public class GenericExtends {
    private static class NumberPair<U extends Number, V extends Number> extends GenericClass.Pair<U, V> {
        public NumberPair(U key, V value) {
            super(key, value);
        }
        public double geSum() {
            return getFirst().doubleValue() + getSecond().intValue();
        }
    }
    public static void main(String[] args) {
        NumberPair<Double, java.lang.Integer> np = new NumberPair<>(3.3, 3);
        System.out.println(np.getFirst());
    }
}
