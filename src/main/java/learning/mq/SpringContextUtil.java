package learning.mq;

import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author Lin JingHui
 * @date 2019/1/8
 */
@Component
public class SpringContextUtil implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    public SpringContextUtil() {
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        applicationContext = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        checkApplicationContext();
        return applicationContext;
    }

    public static <T> T getBean(String name) {
        checkApplicationContext();
        return (T) applicationContext.getBean(name);
    }

    public static <T> T getBean(Class<T> requiredType) {
        checkApplicationContext();
        return applicationContext.getBean(requiredType);
    }

    public static boolean containsBean(String name) {
        checkApplicationContext();
        return applicationContext.containsBean(name);
    }

    public static <T> Map<String, T> getBeans(Class<T> requiredType) {
        checkApplicationContext();
        return applicationContext.getBeansOfType(requiredType);
    }

    public static void cleanApplicationContext() {
        applicationContext = null;
    }

    private static void checkApplicationContext() {
        if (applicationContext == null) {
            throw new IllegalStateException("applicaitonContext未注入,请在applicationContext.xml中定义SpringContextUtil");
        }
    }
}
