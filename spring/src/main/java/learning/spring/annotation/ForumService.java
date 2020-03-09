/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.spring.annotation;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/11/27 10:41
 * @Version V1.0
 */
public class ForumService {

    @NeedTest
    public void deleteForum(int forumId) {
        System.out.println("删除论坛模块：" + forumId);
    }

    @NeedTest(value = false)
    public void deleteTopic(int postId) {
        System.out.println("删除论坛主题：" + postId);
    }
}
