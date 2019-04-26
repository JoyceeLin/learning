/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.basic.generics;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/26 13:47
 * @Version V1.0
 */
public class GenericClass {

    public static class Pair<U, V> {
        private U first;
        private V second;

        public Pair(U first, V second) {
            this.first = first;
            this.second = second;
        }

        public U getFirst() {
            return this.first;
        }

        public V getSecond() {
            return this.second;
        }

        public static void main(String[] args) {
            Pair<String, java.lang.Integer> pair = new Pair<>("", 123);
        }
    }
}
