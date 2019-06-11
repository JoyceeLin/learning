/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.design.pattern.bridge;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/6/11 9:59
 * @Version V1.0
 */
public abstract class Shape {

    protected ColorApi colorApi;

    protected Shape(ColorApi colorApi) {
        this.colorApi = colorApi;
    }

    public abstract void draw();
}
