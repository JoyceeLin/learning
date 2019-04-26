/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.design.pattern.observer.subjects;

import learning.design.pattern.observer.observers.Observer;

import java.util.ArrayList;

/**
 * @Description: 天气预报
 * @Author: JingHui Lin
 * @Date: 2019/4/26 19:17
 * @Version V1.0
 */
public class WeatherData implements Subject {

    /**
     * 温度
     */
    private double temperature;
    /**
     * 湿度
     */
    private double humidity;
    /**
     * 压力
     */
    private double pressure;

    /**
     * 观察者
     */
    private ArrayList<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void setData(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        dataChanged();
    }

    public void dataChanged() {
        notifyObservers();
    }

    @Override
    public void registerObservers(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObservers(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.temperature, this.humidity, this.pressure);
        }
    }
}
