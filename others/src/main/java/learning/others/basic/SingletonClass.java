/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package learning.others.basic;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/5/12 14:25
 * @Version V1.0
 */
public class SingletonClass {

    private volatile static SingletonClass instance;

    private SingletonClass() {
    }

    public static SingletonClass getSingleton() throws InterruptedException {
        if (instance == null) {
            // 如锁住 instance对象 会有空指针问题
            synchronized (SingletonClass.class) {
                System.out.println("aaaaaaaaaaaaa");
                if (instance == null) {
                    instance = new SingletonClass();
                }
                Thread.sleep(10000);
            }
        }
        return instance;
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            try {
                SingletonClass singletonClass = SingletonClass.getSingleton();
                System.out.println(singletonClass);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        Thread.sleep(1000);
        new Thread(() -> {
            try {
                SingletonClass singletonClass = SingletonClass.getSingleton();
                System.out.println(singletonClass);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
