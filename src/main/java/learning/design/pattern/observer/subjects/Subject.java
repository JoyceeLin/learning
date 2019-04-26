/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.design.pattern.observer.subjects;


import learning.design.pattern.observer.observers.Observer;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/26 19:13
 * @Version V1.0
 */
public interface Subject {

    /**
     * 注册
     * @param o 观察者
     */
    void registerObservers(Observer o);

    /**
     * 注销
     * @param o 观察者
     */
    void removeObservers(Observer o);

    /**
     * 通知所有观察者
     */
    void notifyObservers();
}
