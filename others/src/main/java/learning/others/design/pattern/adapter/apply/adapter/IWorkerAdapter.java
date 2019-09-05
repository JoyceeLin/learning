/*
 *
 */
package learning.others.design.pattern.adapter.apply.adapter;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/5/29 16:41
 * @Version V1.0
 */
public interface IWorkerAdapter {

    String work(Object worker);

    boolean isSupport(Object worker);
}
