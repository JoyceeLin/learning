///*
// *
// */
//package learning.framework.spring.async;
//
//import org.springframework.scheduling.annotation.Async;
//import org.springframework.stereotype.Component;
//
//import java.util.Map;
//
///**
// * @Description: TODO
// * @Author: JingHui Lin
// * @Date: 2019/4/28 15:32
// * @Version V1.0
// */
//@Component
//public class AsyncMailTrigger {
//    @Async
//    public void senMail(Map<String,String> properties) {
//        System.out.println("Trigger mail in a New Thread :: "  + Thread.currentThread().getName());
//        properties.forEach((K,V)->System.out.println("Key::" + K + " Value ::" + V));
//    }
//}
