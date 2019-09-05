/*
 *
 */
package learning.others.design.pattern.adapter.apply.worker;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/5/29 16:44
 * @Version V1.0
 */
public class HmjCooker implements ICooker {
    @Override
    public String cook() {
        return "黄焖鸡";
    }
}
