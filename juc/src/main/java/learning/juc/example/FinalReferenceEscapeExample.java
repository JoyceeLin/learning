/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.juc.example;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/9/5 10:57
 * @Version V1.0
 */
public class FinalReferenceEscapeExample {

    private final int i;
    private static FinalReferenceEscapeExample obj;

    public FinalReferenceEscapeExample() {
        i = 1;
        obj = this;
    }

    public static void writer() {
        new FinalReferenceEscapeExample();
    }

    public static void reader() {
        if (obj != null) {
            int temp = obj.i;
        }
    }

    public static void main(String[] args) {

    }
}
