/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.framework.spring.async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/28 15:31
 * @Version V1.0
 */
@Component
public class AsyncCaller {
    @Autowired
    AsyncMailTrigger asyncMailTriggerObject;

    public void rightWayToCall() {
        System.out.println("Calling From rightWayToCall Thread " + Thread.currentThread().getName());
        asyncMailTriggerObject.senMail(populateMap());
    }

    public void wrongWayToCall() {
        System.out.println("Calling From wrongWayToCall Thread " + Thread.currentThread().getName());
        this.senMail(populateMap());
    }

    private Map<String,String> populateMap(){
        Map<String,String> mailMap= new HashMap<String,String>();
        mailMap.put("body", "A Ask2Shamik Article");
        return mailMap;
    }

    @Async
    public void senMail(Map<String,String> properties) {
        System.out.println("Trigger mail in a New Thread :: "  + Thread.currentThread().getName());
        properties.forEach((K,V)->System.out.println("Key::" + K + " Value ::" + V));
    }
}
