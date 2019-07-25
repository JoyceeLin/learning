/*
 *
 */
package learning.design.pattern.adapter.apply.adapter;

import learning.design.pattern.adapter.apply.worker.IProgramer;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/5/29 16:54
 * @Version V1.0
 */
public class ProgrammerAdapter implements IWorkerAdapter {

    @Override
    public String work(Object worker) {
        return ((IProgramer) worker).programme();
    }

    @Override
    public boolean isSupport(Object worker) {
        return worker instanceof IProgramer;
    }
}
