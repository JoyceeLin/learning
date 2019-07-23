///*
// * Copyright (C), 2005-2019,
// */
//package learning.basic.juc;
//
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.Semaphore;
//
///**
// * @Description: TODO
// * @Author: JingHui Lin
// * @Date: 2019/7/9 10:13
// * @Version V1.0
// */
//public class SemaphoreExample {
//
//    public static void main(String[] args) {
//        ThreadLocal threadLocal = new ThreadLocal();
//        Thread thread1 = new Thread(() -> {
//            threadLocal.set(1);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(threadLocal.get());
//            threadLocal.remove();
//        });
//        Thread thread2 = new Thread(() -> {
//            threadLocal.set(2);
//            System.out.println(threadLocal.get());
//            threadLocal.remove();
//        });
//        thread1.start();
//        thread2.start();
//    }
//}
