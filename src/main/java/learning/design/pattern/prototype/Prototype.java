/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.design.pattern.prototype;

import java.util.ArrayList;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/5/29 15:26
 * @Version V1.0
 */
public class Prototype implements Cloneable {

    private ArrayList list = new ArrayList();

    @Override
    public Prototype clone() {
        Prototype prototype = new Prototype();
        try {
            prototype = (Prototype) super.clone();
            prototype.list = (ArrayList) this.list.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}
