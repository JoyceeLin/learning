/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.design.pattern.observer;

import learning.design.pattern.observer.observers.CurrentConditionDisplay;
import learning.design.pattern.observer.observers.TomorrowConditionDisplay;
import learning.design.pattern.observer.subjects.WeatherData;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/26 19:27
 * @Version V1.0
 */
public class MyTest {

    /**
     * 观察者模式，可用于实现消息队列之类的通知业务
     */
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay();
        TomorrowConditionDisplay tomorrowConditionDisplay = new TomorrowConditionDisplay();
        weatherData.registerObservers(currentConditionDisplay);
        weatherData.registerObservers(tomorrowConditionDisplay);
        weatherData.setData(10, 100, 50);

        System.out.println("------------------------------");
        weatherData.removeObservers(tomorrowConditionDisplay);
        weatherData.setData(20, 200, 25);
    }
}
