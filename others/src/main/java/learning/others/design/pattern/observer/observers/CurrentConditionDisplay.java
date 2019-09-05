/*
 *
 */
package learning.others.design.pattern.observer.observers;

/**
 * @Description: 即时天气预报
 * @Author: JingHui Lin
 * @Date: 2019/4/26 19:23
 * @Version V1.0
 */
public class CurrentConditionDisplay implements Observer {

    private double temperature;
    private double humidity;
    private double pressure;

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("CurrentDisplay : " +
                "[" + temperature +
                ", " + humidity +
                ", " + pressure + "]");
    }
}
