/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.juc.example;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/9/13 18:38
 * @Version V1.0
 */

public class VolatileExample extends Thread {

    private static boolean flag = false;

    @Override
    public void run() {
        while (!flag) {
        }
    }

    public static void main(String[] args) throws Exception {
        new VolatileExample().start();
        Thread.sleep(100);
        flag = true;
    }
}
