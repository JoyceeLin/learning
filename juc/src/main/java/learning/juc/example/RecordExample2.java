/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.juc.example;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/9/16 11:16
 * @Version V1.0
 */
public class RecordExample2 {
    private int a = 0;
    private boolean flag = false;

    /**
     * A线程执行
     */
    public void writer() {
        // 1
        a = 1;
        // 2
        flag = true;
    }

    /**
     * B线程执行
     */
    public void read() {
        // 3
        if (flag) {
            // 4
            int i = a + a;
        }
    }

}