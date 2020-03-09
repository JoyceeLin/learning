package learning.spring;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
        Class clazz = classLoader.loadClass("learning.spring.App");
        App app = (App) clazz.newInstance();
        System.out.println(app);
    }
}
