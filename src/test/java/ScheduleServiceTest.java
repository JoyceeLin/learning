///**
// * BrandBigData.com Inc.
// * Copyright (c) 2016 All Rights Reserved.
// */
//package com.bbd.toolkit.schedule;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.SpyBean;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.time.LocalDateTime;
//import java.util.concurrent.TimeUnit;
//
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//
///**
// * @author xumin
// * @version $Id:ScheduleServiceTest.java, v0.1 2017/12/20 0:15 xumin
// */
//@SpringBootTest
//@RunWith(SpringRunner.class)
//public class ScheduleServiceTest {
//
//    private static final Logger logger = LoggerFactory.getLogger(ScheduleServiceTest.class);
//
//    @Autowired
//    private ScheduleService scheduleService;
//    @SpyBean(name = "junitTestTask")
//    private Task testTask;
//
//    @Test
//    public void testAddSchedule() throws InterruptedException {
//        ScheduleTaskDO junitTestTask = scheduleService.findByScheduleName("junitTestTask");
//        if (null != junitTestTask) {
//            scheduleService.deleteSchedule(junitTestTask.getId());
//        }
//        //睡到整分钟，便于后面验证执行次数
//        TimeUnit.SECONDS.sleep(60 - LocalDateTime.now().getSecond());
//
//        int scheduleId = scheduleService.addSchedule("junitTestTask", "junitTestTask", "1", "0 * * * * ? *");
//        logger.warn("" + scheduleId);
//        TimeUnit.SECONDS.sleep(70);
//        verify(testTask, times(1)).execute("1");
//    }
//
//}
