/*
 *
 */
package learning.others.basic.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/26 14:45
 * @Version V1.0
 */
public class GenericExtends4 {
    private static class Fruit {
    }

    private static class Apple extends Fruit {
    }

    private static class Pear extends Fruit {
    }

    private static class FuShiApple extends Apple {
    }

    static class Clazz<T extends Fruit> {  //创建的类必须是Fruit的子类//为了自己类中使用这个类
    }

    public static void main(String[] args) {
        Clazz<Fruit> t = new Clazz<>();
        Clazz<Apple> t2 = new Clazz<>();
        Clazz<Pear> t3 = new Clazz<>();
        Clazz<FuShiApple> t4 = new Clazz<>();


        //调用方法
        List<? extends Fruit> list1 = new ArrayList<>();
        add(list1);
        List<Fruit> list2 = new ArrayList<>();
        add(list2);
        List<Apple> list3 = new ArrayList<>();
        add(list3);
        List<? extends Apple> list4 = new ArrayList<FuShiApple>();
        add(list4);
        List<FuShiApple> list5 = new ArrayList<>();
        add(list5);


        //？为什么错误 : 因为 ? 等同于？ extends Object :不是<= Fruit的 下面两个是一样的
        List<?> list6 = new ArrayList<>();
        List<? extends Object> list7 = new ArrayList<>();
        //add(list6); // err
        //add(list7); // err
    }

    /**
     *  为了保证向下兼容的一致性，不能添加元素
     */
    public static void add(List<? extends Fruit> list) {
        // 不能往里面加这样的对象 不能用于添加数据
//        list.add(new Fruit());
//        list.add(new Apple());
//        list.add(new Pear());
        list.add(null);
    }
}
