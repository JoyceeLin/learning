package learning.others.basic.inheritance;

/**
 * @Author Lin JingHui
 * @Date 2019/3/20
 */
public class TestInheritance {

    private static Father father;
    static {
        father = new Son();
    }

    public void test() {
        father.test();
    }
}
