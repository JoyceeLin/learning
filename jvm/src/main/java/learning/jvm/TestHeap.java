/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package learning.jvm;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/17 16:32
 * @Version V1.0
 */
public class TestHeap {

    public static void main(String[] args) {
        List<Object> list = new LinkedList<>();
        int i = 0;
        while (true) {
            i++;
            if (i % 1000 == 0) {
                System.out.println("i:" + i);
            }
            list.add(new Object());
        }
    }

}
