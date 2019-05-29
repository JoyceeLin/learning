/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.design.pattern.adapter.apply.worker;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/5/29 16:49
 * @Version V1.0
 */
public class ZAProgrammer implements IProgramer {

    @Override
    public String programme() {
        return "打代码";
    }
}
