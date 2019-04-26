/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.basic.generics;

import java.util.Arrays;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/26 14:28
 * @Version V1.0
 */
public class GenericExtends3 {// seems like ArrayList
    private static class DynamicArray<E>{

        private static final int DEFAULT_CAPACITY = 10;
        private int size;
        private Object[] data;

        public DynamicArray() {
            this.data = new Object[DEFAULT_CAPACITY];
        }
        private void ensureCapacity(int minCapacity){
            int oldCapacity = data.length;
            if (oldCapacity >= minCapacity) {
                return;
            }
            int newCapacity = oldCapacity * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            data = Arrays.copyOf(data, newCapacity);
        }

        public void add(E e){
            ensureCapacity(size + 1);
            data[size++] = e;
        }

        public E get(int index){
            return (E)data[index];
        }

        public int size(){
            return size;
        }

        public E set(int index, E e){
            E oldValue = get(index);
            data[index] = e;
            return oldValue;
        }

        public <T extends E>void addAll(DynamicArray<T>arr){
            for(int i = 0; i < arr.size; i++){
                add(arr.get(i));
            }
        }

        public void copyTo(DynamicArray<? super E> dest) {
            for (int i = 0; i < dest.size; i++) {
                dest.add(this.get(i));
            }
        }
    }

    public static int indexOf(DynamicArray<?> arr, Object elm) {
        for (int i = 0; i < arr.size; i++) {
            if (arr.get(i).equals(elm)) {
                return i;
            }
        }
        return -1;
    }

    public static <T> int indexOf2(DynamicArray<T> arr, Object elm) {
        for (int i = 0; i < arr.size; i++) {
            if (arr.get(i).equals(elm)) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args){

    }
}
