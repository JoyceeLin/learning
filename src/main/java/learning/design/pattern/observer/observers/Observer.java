/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.design.pattern.observer.observers;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/26 19:15
 * @Version V1.0
 */
public interface Observer {
    /**
     * 更新
     */
    void update(double temperature, double humidity, double pressure);
}
