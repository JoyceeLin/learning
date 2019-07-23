/*
 *
 */
package learning.design.pattern.bridge;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/6/11 10:01
 * @Version V1.0
 */
public class Circle extends Shape {

    private String name;

    public Circle(String name, ColorApi colorApi) {
        super(colorApi);
        this.name = name;
    }

    @Override
    public void draw() {
        colorApi.draw(name);
    }
}
