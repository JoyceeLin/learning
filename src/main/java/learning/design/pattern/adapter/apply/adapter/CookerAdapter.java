/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.design.pattern.adapter.apply.adapter;

import learning.design.pattern.adapter.apply.worker.ICooker;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/5/29 16:41
 * @Version V1.0
 */
public class CookerAdapter implements IWorkerAdapter {

    @Override
    public String work(Object worker) {
        return ((ICooker) worker).cook();
    }

    @Override
    public boolean isSupport(Object worker) {
        return (worker instanceof ICooker);
    }
}
