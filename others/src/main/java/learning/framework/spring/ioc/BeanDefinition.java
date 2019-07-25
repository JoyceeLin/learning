package learning.framework.spring.ioc;

/**
 * @Author Administrator
 * @Date 2019/1/16
 */
public interface BeanDefinition {

    final static String SINGLETON = "singleton";

    final static String PROTOTYPE = "prototype";

    Class<?> getBeanClass();

    String getScope();

    boolean isSingleton();

    boolean isPrototype();

    String getInitMethodName();
}
