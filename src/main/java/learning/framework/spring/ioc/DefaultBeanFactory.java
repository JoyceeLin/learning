package learning.framework.spring.ioc;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author Lin JingHui
 * @Date 2019/1/16
 */
public class DefaultBeanFactory implements BeanFactory, BeanDefinitionRegistry{

    private Map<String, Object> beanMap = new ConcurrentHashMap<>();

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) throws Exception {
        Objects.requireNonNull(beanName, "beanName不能为空");
        Objects.requireNonNull(beanDefinition, "beanDefinition不能为空");
        if (beanDefinitionMap.containsKey(beanName)) {
            throw new Exception("已存在【" + beanName + "】的bean定义" + getBeanDefinition(beanName));
        }
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    public BeanDefinition getBeanDefinition(String beanName) {
        return beanDefinitionMap.get(beanName);
    }

    @Override
    public boolean containsBeanDefinition(String beanName) {
        return beanDefinitionMap.containsKey(beanName);
    }

    /**
     * 门面模式
     */
    @Override
    public Object getBean(String name) throws Exception {
        return doGetBean(name);
    }

    private Object doGetBean(String beanName) throws Exception{
        Objects.requireNonNull(beanName, "beanName不能为空");
        Object instance = beanMap.get(beanName);
        // 如果bean存在，则返回
        if (instance != null) {
            return instance;
        }
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        Objects.requireNonNull(beanDefinition, "beanDefinition不能为空");
        Class<?> class1 = beanDefinition.getBeanClass();
        Objects.requireNonNull(class1, "bean定义中class类型不能为空");
        instance = class1.newInstance();

        // 反射调用init方法
        String initMethodName = beanDefinition.getInitMethodName();
        if (null != initMethodName) {
            Method method = class1.getMethod(initMethodName);
            method.invoke(instance);
        }

        // 将单例bean放到map中，下次可直接拿到
        if (beanDefinition.isSingleton()) {
            beanMap.put(beanName, instance);
        }
        return instance;
    }
}
