/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.basic.annotation;

import java.lang.annotation.Annotation;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/13 17:50
 * @Version V1.0
 */
public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        Class tClass = test.getClass();
        Annotation[] annotations = tClass.getAnnotations();
        for (Annotation annotation : annotations) {
            Msg msg = (Msg) annotation;
            System.out.println(annotation);
            System.out.println(msg.msg());
        }

        A a = new B();
    }
}


class A {

}

class B extends A{}
