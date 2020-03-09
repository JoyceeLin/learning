/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.juc.example;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/9/16 11:52
 * @Version V1.0
 */
public class LazySingleton {

    private static volatile LazySingleton instance = null;

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }

        return instance;
    }

    public static void main(String[] args) {
        LazySingleton.getInstance();
    }

}
