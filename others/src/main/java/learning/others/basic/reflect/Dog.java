/*
 *
 */
package learning.others.basic.reflect;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/26 15:08
 * @Version V1.0
 */
public class Dog implements Animal, Movable {

    private int id;
    private String name;
    private int age;

    /**
     * 公共属性
     */
    public String desc;

    public Dog() {

    }

    /**
     * 私有方法
     */
    private Dog(String name) {
        this.name = name;
    }

    /**
     * 三个参数的构造方法
     */
    public Dog(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * 两个私有方法
     */
    private void privateMethod() {
        System.out.println(" private method...");
    }

    private void privateMethod2(String name) {
        System.out.println(" private method2..." + name);
    }

    /**
     * 一个静态方法
     */
    public static void staticMethod() {
        System.out.println("static method ...");
    }

    /**
     * eat是重写的方法
     */
    @Override
    public void eat() {
        System.out.println("dog eat...(interface override method)");
    }

    @Override
    public void move() {
        System.out.println("dog move...(interface override method)");
    }
}
