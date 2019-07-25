/*
 *
 */
package learning.design.pattern.bridge;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/6/11 9:58
 * @Version V1.0
 */
public class GreenPen implements ColorApi {

    @Override
    public void draw(String name) {
        System.out.println("use green pen draw " + name);
    }
}
