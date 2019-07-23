/*
 *
 */
package learning.design.pattern.bridge;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/6/11 10:03
 * @Version V1.0
 */
public class Main {

    /**
     * 有多种排列组合考虑使用桥接模式
     */
    public static void main(String[] args) {
        Shape blueRectangle = new Rectangle("rectangle", new BluePen());
        blueRectangle.draw();

        Shape redCircle = new Rectangle("circle", new RedPen());
        redCircle.draw();
    }
}
