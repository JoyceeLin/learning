/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.design.pattern.adapter.apply.adapter;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/5/29 16:41
 * @Version V1.0
 */
public interface IWorkerAdapter {

    String work(Object worker);

    boolean isSupport(Object worker);
}
