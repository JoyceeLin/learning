/*
 *
 */
package learning.others.design.pattern.adapter.apply;

import learning.others.design.pattern.adapter.apply.adapter.CookerAdapter;
import learning.others.design.pattern.adapter.apply.adapter.IWorkerAdapter;
import learning.others.design.pattern.adapter.apply.adapter.ProgrammerAdapter;
import learning.others.design.pattern.adapter.apply.worker.HmjCooker;
import learning.others.design.pattern.adapter.apply.worker.ICooker;
import learning.others.design.pattern.adapter.apply.worker.IProgramer;
import learning.others.design.pattern.adapter.apply.worker.ZAProgrammer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/5/29 16:50
 * @Version V1.0
 */
public class MyTest {

//    public static void main(String[] args) {
//        ICooker iCooker = new HmjCooker();
//        IProgramer iProgramer = new ZAProgrammer();
//
//        System.out.println(iCooker.cook());
//        System.out.println(iProgramer.programme());
//    }

    private static List<IWorkerAdapter> adapters;
    public static void main(String[] args) {
        ICooker iCooker = new HmjCooker();
        IProgramer iProgramer = new ZAProgrammer();

        Object[] workers = {iCooker, iProgramer};
        adapters = new ArrayList<>();
        adapters.add(new CookerAdapter());
        adapters.add(new ProgrammerAdapter());

        for (Object worker : workers) {
            System.out.println(Objects.requireNonNull(getAdapter(worker)).work(worker));
        }
    }

    private static IWorkerAdapter getAdapter(Object worker) {
        for (IWorkerAdapter adapter : adapters) {
            if (adapter.isSupport(worker)) {
                return adapter;
            }
        }
        return null;
    }
}
