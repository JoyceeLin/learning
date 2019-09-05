/*
 *
 */
package learning.others.design.pattern.observer.observers;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/26 19:25
 * @Version V1.0
 */
public class TomorrowConditionDisplay implements Observer {

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
        System.out.println("TomorrowDisplay : " +
                "[" + temperature * ((int) (10 * Math.random()) / 2 + 1) +
                ", " + humidity * ((int) (10 * Math.random()) / 2 + 1) +
                ", " + pressure * ((int) (10 * Math.random()) / 2 + 1) + "]");
    }
}
